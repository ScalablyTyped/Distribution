package typings.behavior3.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BaseNode class is used as super class to all nodes in BehaviorJS. It
  * comprises all common variables and methods that a node must have to
  * execute.
  *
  * **IMPORTANT:** Do not inherit from this class, use `Composite`,
  * `Decorator`, `Action` or `Condition`, instead.
  *
  * The attributes are specially designed to serialization of the node in a
  * JSON format. In special, the `parameters` attribute can be set into the
  * visual editor (thus, in the JSON file), and it will be used as parameter
  * on the node initialization at `BehaviorTree.load`.
  *
  * BaseNode also provide 5 callback methods, which the node implementations
  * can override. They are `enter`, `open`, `tick`, `close` and `exit`. See
  * their documentation to know more. These callbacks are called inside the
  * `_execute` method, which is called in the tree traversal.
  *
  */
trait BaseNode extends js.Object {
  /**
    * Wrapper for close method.
    */
  def _close(tick: Tick): Unit
  /**
    * Wrapper for enter method.
    */
  def _enter(tick: Tick): Unit
  /**
    * This is the main method to propagate the tick signal to this node. This
    * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
    * `exit`. It only opens a node if it is not already open. In the same
    * way, this method only close a node if the node  returned a status
    * different of `RUNNING`.
    *
    */
  def _execute(tick: Tick): Double
  /**
    * Wrapper for exit method.
    */
  def _exit(tick: Tick): Unit
  /**
    * Wrapper for open method.
    */
  def _open(tick: Tick): Unit
  /**
    * Wrapper for tick method.
    */
  def _tick(tick: Tick): Double
  /**
    * Close method, override this to use. This method is called after the tick
    * callback, and only if the tick return a state different from
    * `RUNNING`.
    *
    */
  def close(tick: Tick): Unit
  /**
    * Enter method, override this to use. It is called every time a node is
    * asked to execute, before the tick itself.
    */
  def enter(tick: Tick): Unit
  /**
    * Exit method, override this to use. Called every time in the end of the
    * execution.
    *
    */
  def exit(tick: Tick): Unit
  /**
    * Open method, override this to use. It is called only before the tick
    * callback and only if the not isn't closed.
    *
    * Note: a node will be closed if it returned `RUNNING` in the tick.
    *
    */
  def open(tick: Tick): Unit
  /**
    * Tick method, override this to use. This method must contain the real
    * execution of node (perform a task, call children, etc.). It is called
    * every time a node is asked to execute.
    *
    */
  def tick(tick: Tick): Unit
}

object BaseNode {
  @scala.inline
  def apply(
    _close: Tick => Unit,
    _enter: Tick => Unit,
    _execute: Tick => Double,
    _exit: Tick => Unit,
    _open: Tick => Unit,
    _tick: Tick => Double,
    close: Tick => Unit,
    enter: Tick => Unit,
    exit: Tick => Unit,
    open: Tick => Unit,
    tick: Tick => Unit
  ): BaseNode = {
    val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
    __obj.asInstanceOf[BaseNode]
  }
}


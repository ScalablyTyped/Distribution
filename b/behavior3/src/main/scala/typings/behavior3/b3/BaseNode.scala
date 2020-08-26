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
@js.native
trait BaseNode extends js.Object {
  /**
    * Wrapper for close method.
    */
  def _close(tick: Tick): Unit = js.native
  /**
    * Wrapper for enter method.
    */
  def _enter(tick: Tick): Unit = js.native
  /**
    * This is the main method to propagate the tick signal to this node. This
    * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
    * `exit`. It only opens a node if it is not already open. In the same
    * way, this method only close a node if the node  returned a status
    * different of `RUNNING`.
    *
    */
  def _execute(tick: Tick): Double = js.native
  /**
    * Wrapper for exit method.
    */
  def _exit(tick: Tick): Unit = js.native
  /**
    * Wrapper for open method.
    */
  def _open(tick: Tick): Unit = js.native
  /**
    * Wrapper for tick method.
    */
  def _tick(tick: Tick): Double = js.native
  /**
    * Close method, override this to use. This method is called after the tick
    * callback, and only if the tick return a state different from
    * `RUNNING`.
    *
    */
  def close(tick: Tick): Unit = js.native
  /**
    * Enter method, override this to use. It is called every time a node is
    * asked to execute, before the tick itself.
    */
  def enter(tick: Tick): Unit = js.native
  /**
    * Exit method, override this to use. Called every time in the end of the
    * execution.
    *
    */
  def exit(tick: Tick): Unit = js.native
  /**
    * Open method, override this to use. It is called only before the tick
    * callback and only if the not isn't closed.
    *
    * Note: a node will be closed if it returned `RUNNING` in the tick.
    *
    */
  def open(tick: Tick): Unit = js.native
  /**
    * Tick method, override this to use. This method must contain the real
    * execution of node (perform a task, call children, etc.). It is called
    * every time a node is asked to execute.
    *
    */
  def tick(tick: Tick): Unit = js.native
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
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_close(value: Tick => Unit): Self = this.set("_close", js.Any.fromFunction1(value))
    @scala.inline
    def set_enter(value: Tick => Unit): Self = this.set("_enter", js.Any.fromFunction1(value))
    @scala.inline
    def set_execute(value: Tick => Double): Self = this.set("_execute", js.Any.fromFunction1(value))
    @scala.inline
    def set_exit(value: Tick => Unit): Self = this.set("_exit", js.Any.fromFunction1(value))
    @scala.inline
    def set_open(value: Tick => Unit): Self = this.set("_open", js.Any.fromFunction1(value))
    @scala.inline
    def set_tick(value: Tick => Double): Self = this.set("_tick", js.Any.fromFunction1(value))
    @scala.inline
    def setClose(value: Tick => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setEnter(value: Tick => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def setExit(value: Tick => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Tick => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def setTick(value: Tick => Unit): Self = this.set("tick", js.Any.fromFunction1(value))
  }
  
}


package typings.behavior3.b3Ns

import typings.behavior3.Anon_Category
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
@JSGlobal("b3.BaseNode")
@js.native
/**
  * Initialization method.
  */
class BaseNode () extends js.Object {
  def this(hasCategoryNameTitleDescriptionProperties: Anon_Category) = this()
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


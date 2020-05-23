package typings.behavior3.global.b3

import typings.behavior3.anon.Category
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
class BaseNode ()
  extends typings.behavior3.b3.BaseNode {
  def this(hasCategoryNameTitleDescriptionProperties: Category) = this()
  /**
    * Wrapper for close method.
    */
  /* CompleteClass */
  override def _close(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Wrapper for enter method.
    */
  /* CompleteClass */
  override def _enter(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * This is the main method to propagate the tick signal to this node. This
    * method calls all callbacks: `enter`, `open`, `tick`, `close`, and
    * `exit`. It only opens a node if it is not already open. In the same
    * way, this method only close a node if the node  returned a status
    * different of `RUNNING`.
    *
    */
  /* CompleteClass */
  override def _execute(tick: typings.behavior3.b3.Tick): Double = js.native
  /**
    * Wrapper for exit method.
    */
  /* CompleteClass */
  override def _exit(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Wrapper for open method.
    */
  /* CompleteClass */
  override def _open(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Wrapper for tick method.
    */
  /* CompleteClass */
  override def _tick(tick: typings.behavior3.b3.Tick): Double = js.native
  /**
    * Close method, override this to use. This method is called after the tick
    * callback, and only if the tick return a state different from
    * `RUNNING`.
    *
    */
  /* CompleteClass */
  override def close(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Enter method, override this to use. It is called every time a node is
    * asked to execute, before the tick itself.
    */
  /* CompleteClass */
  override def enter(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Exit method, override this to use. Called every time in the end of the
    * execution.
    *
    */
  /* CompleteClass */
  override def exit(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Open method, override this to use. It is called only before the tick
    * callback and only if the not isn't closed.
    *
    * Note: a node will be closed if it returned `RUNNING` in the tick.
    *
    */
  /* CompleteClass */
  override def open(tick: typings.behavior3.b3.Tick): Unit = js.native
  /**
    * Tick method, override this to use. This method must contain the real
    * execution of node (perform a task, call children, etc.). It is called
    * every time a node is asked to execute.
    *
    */
  /* CompleteClass */
  override def tick(tick: typings.behavior3.b3.Tick): Unit = js.native
}


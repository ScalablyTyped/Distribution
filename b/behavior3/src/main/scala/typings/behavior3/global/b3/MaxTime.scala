package typings.behavior3.global.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The MaxTime decorator limits the maximum time the node child can execute.
  * Notice that it does not interrupt the execution itself (i.e., the child
  * must be non-preemptive), it only interrupts the node after a `RUNNING`
  * status.
  *
  */
@JSGlobal("b3.MaxTime")
@js.native
/**
  * Creates an instance of MaxTime.
  *
  * - **maxTime** (*Integer*) Maximum time a child can execute.
  * - **child** (*BaseNode*) The child node.
  *
  */
class MaxTime ()
  extends typings.behavior3.b3.MaxTime {
  def this(hasMaxTimeChild: typings.behavior3.anon.MaxTime) = this()
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


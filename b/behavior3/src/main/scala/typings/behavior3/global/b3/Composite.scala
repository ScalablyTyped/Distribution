package typings.behavior3.global.b3

import typings.behavior3.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composite is the base class for all composite nodes. Thus, if you want to
  * create new custom composite nodes, you need to inherit from this class.
  *
  * When creating composite nodes, you will need to propagate the tick signal
  * to the children nodes manually. To do that, override the `tick` method and
  * call the `_execute` method on all nodes. For instance, take a look at how
  * the Sequence node inherit this class and how it call its children:
  *
  *     // Inherit from Composite, using the util function Class.
  *     class Sequence extends Composite {
  *
  *       constructor(){
  *         // Remember to set the name of the node.
  *         super({name: 'Sequence'});
  *       }
  *
  *       // Override the tick function
  *       tick(tick) {
  *
  *         // Iterates over the children
  *         for (var i=0; i<this.children.length; i++) {
  *
  *           // Propagate the tick
  *           var status = this.children[i]._execute(tick);
  *
  *           if (status !== SUCCESS) {
  *               return status;
  *           }
  *         }
  *
  *         return SUCCESS;
  *       }
  *     };
  *
  */
@JSGlobal("b3.Composite")
@js.native
/**
  * Creates an instance of Composite.
  */
class Composite ()
  extends typings.behavior3.b3.BaseNode {
  def this(hasChildrenNameTitleProperties: Children) = this()
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


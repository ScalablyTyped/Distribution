package typings
package behavior3Lib.b3Ns

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
class Composite () extends BaseNode {
  def this(hasChildrenNameTitleProperties: behavior3Lib.Anon_Children) = this()
}


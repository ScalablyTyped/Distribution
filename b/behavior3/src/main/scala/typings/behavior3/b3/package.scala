package typings.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object b3 {
  /**
    * Action is the base class for all action nodes. Thus, if you want to create
    * new custom action nodes, you need to inherit from this class. For example,
    * take a look at the Runner action:
    *
    *     class Runner extends b3.Action {
    *       constructor(){
    *         super({name: 'Runner'});
    *       }
    *       tick(tick) {
    *         return b3.RUNNING;
    *       }
    *     };
    *
    */
  type Action = typings.behavior3.b3.BaseNode
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
  type Composite = typings.behavior3.b3.BaseNode
  /**
    * Condition is the base class for all condition nodes. Thus, if you want to
    * create new custom condition nodes, you need to inherit from this class.
    *
    */
  type Condition = typings.behavior3.b3.BaseNode
  /**
    * Decorator is the base class for all decorator nodes. Thus, if you want to
    * create new custom decorator nodes, you need to inherit from this class.
    *
    * When creating decorator nodes, you will need to propagate the tick signal
    * to the child node manually, just like the composite nodes. To do that,
    * override the `tick` method and call the `_execute` method on the child
    * node. For instance, take a look at how the Inverter node inherit this
    * class and how it call its children:
    *
    *     // Inherit from Decorator, using the util function Class.
    *     class Inverter extends b3.Decorator {
    *
    *       constructor(){
    *         super({name: 'Invereter'});
    *       }
    *
    *       tick: function(tick) {
    *         if (!this.child) {
    *           return b3.ERROR;
    *         }
    *
    *         // Propagate the tick
    *         var status = this.child._execute(tick);
    *
    *         if (status === b3.SUCCESS) {
    *           status = b3.FAILURE;
    *         } else if (status === b3.FAILURE) {
    *           status = b3.SUCCESS;
    *         }
    *
    *         return status;
    *       }
    *     });
    *
    */
  type Decorator = typings.behavior3.b3.BaseNode
}

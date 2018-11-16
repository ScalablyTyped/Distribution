package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The BehaviorTree class, as the name implies, represents the Behavior Tree
     * structure.
     *
     * There are two ways to construct a Behavior Tree: by manually setting the
     * root node, or by loading it from a data structure (which can be loaded
     * from a JSON). Both methods are shown in the examples below and better
     * explained in the user guide.
     *
     * The tick method must be called periodically, in order to send the tick
     * signal to all nodes in the tree, starting from the root. The method
     * `BehaviorTree.tick` receives a target object and a blackboard as
     * parameters. The target object can be anything: a game agent, a system, a
     * DOM object, etc. This target is not used by any piece of Behavior3JS,
     * i.e., the target object will only be used by custom nodes.
     *
     * The blackboard is obligatory and must be an instance of `Blackboard`. This
     * requirement is necessary due to the fact that neither `BehaviorTree` or
     * any node will store the execution variables in its own object (e.g., the
     * BT does not store the target, information about opened nodes or number of
     * times the tree was called). But because of this, you only need a single
     * tree instance to control multiple (maybe hundreds) objects.
     *
     * Manual construction of a Behavior Tree
     * --------------------------------------
     *
     *     var tree = new b3.BehaviorTree();
     *
     *     tree.root = new b3.Sequence({children:[
     *       new b3.Priority({children:[
     *         new MyCustomNode(),
     *         new MyCustomNode()
     *       ]}),
     *       ...
     *     ]});
     *
     *
     * Loading a Behavior Tree from data structure
     * -------------------------------------------
     *
     *     var tree = new b3.BehaviorTree();
     *
     *     tree.load({
     *       'title'       : 'Behavior Tree title'
     *       'description' : 'My description'
     *       'root'        : 'node-id-1'
     *       'nodes'       : {
     *         'node-id-1' : {
     *           'name'        : 'Priority', // this is the node type
     *           'title'       : 'Root Node',
     *           'description' : 'Description',
     *           'children'    : ['node-id-2', 'node-id-3'],
     *         },
     *         ...
     *       }
     *     })
     *
     */
@JSGlobal("b3.BehaviorTree")
@js.native
class BehaviorTree () extends js.Object {
  /**
           * This method dump the current BT into a data structure.
           *
           * Note: This method does not record the current node parameters. Thus,
           * it may not be compatible with load for now.
           *
           */
  def dump(): js.Any = js.native
  /**
           * This method loads a Behavior Tree from a data structure, populating this
           * object with the provided data. Notice that, the data structure must
           * follow the format specified by Behavior3JS. Consult the guide to know
           * more about this format.
           *
           * You probably want to use custom nodes in your BTs, thus, you need to
           * provide the `names` object, in which this method can find the nodes by
           * `names[NODE_NAME]`. This variable can be a namespace or a dictionary,
           * as long as this method can find the node by its name, for example:
           *
           *     //json
           *     ...
           *     'node1': {
           *       'name': MyCustomNode,
           *       'title': ...
           *     }
           *     ...
           *
           *     //code
           *     var bt = new b3.BehaviorTree();
           *     bt.load(data, {'MyCustomNode':MyCustomNode})
           *
           *
           */
  def load(data: js.Any): scala.Unit = js.native
  /**
           * This method loads a Behavior Tree from a data structure, populating this
           * object with the provided data. Notice that, the data structure must
           * follow the format specified by Behavior3JS. Consult the guide to know
           * more about this format.
           *
           * You probably want to use custom nodes in your BTs, thus, you need to
           * provide the `names` object, in which this method can find the nodes by
           * `names[NODE_NAME]`. This variable can be a namespace or a dictionary,
           * as long as this method can find the node by its name, for example:
           *
           *     //json
           *     ...
           *     'node1': {
           *       'name': MyCustomNode,
           *       'title': ...
           *     }
           *     ...
           *
           *     //code
           *     var bt = new b3.BehaviorTree();
           *     bt.load(data, {'MyCustomNode':MyCustomNode})
           *
           *
           */
  def load(data: js.Any, names: js.Any): scala.Unit = js.native
  /**
           * Propagates the tick signal through the tree, starting from the root.
           *
           * This method receives a target object of any type (Object, Array,
           * DOMElement, whatever) and a `Blackboard` instance. The target object has
           * no use at all for all Behavior3JS components, but surely is important
           * for custom nodes. The blackboard instance is used by the tree and nodes
           * to store execution variables (e.g., last node running) and is obligatory
           * to be a `Blackboard` instance (or an object with the same interface).
           *
           * Internally, this method creates a Tick object, which will store the
           * target and the blackboard objects.
           *
           * Note: BehaviorTree stores a list of open nodes from last tick, if these
           * nodes weren't called after the current tick, this method will close them
           * automatically.
           *
           */
  def tick(target: js.Any, blackboard: Blackboard): java.lang.String = js.native
}


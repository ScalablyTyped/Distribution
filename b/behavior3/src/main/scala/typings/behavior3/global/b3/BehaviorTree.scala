package typings.behavior3.global.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/**
  * Initialization method.
  */
class BehaviorTree ()
  extends typings.behavior3.b3.BehaviorTree

package typings.behavior3.global.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Blackboard is the memory structure required by `BehaviorTree` and its
  * nodes. It only have 2 public methods: `set` and `get`. These methods works
  * in 3 different contexts: global, per tree, and per node per tree.
  *
  * Suppose you have two different trees controlling a single object with a
  * single blackboard, then:
  *
  * - In the global context, all nodes will access the stored information.
  * - In per tree context, only nodes sharing the same tree share the stored
  *   information.
  * - In per node per tree context, the information stored in the blackboard
  *   can only be accessed by the same node that wrote the data.
  *
  * The context is selected indirectly by the parameters provided to these
  * methods, for example:
  *
  *     // getting/setting variable in global context
  *     blackboard.set('testKey', 'value');
  *     var value = blackboard.get('testKey');
  *
  *     // getting/setting variable in per tree context
  *     blackboard.set('testKey', 'value', tree.id);
  *     var value = blackboard.get('testKey', tree.id);
  *
  *     // getting/setting variable in per node per tree context
  *     blackboard.set('testKey', 'value', tree.id, node.id);
  *     var value = blackboard.get('testKey', tree.id, node.id);
  *
  * Note: Internally, the blackboard store these memories in different
  * objects, being the global on `_baseMemory`, the per tree on `_treeMemory`
  * and the per node per tree dynamically create inside the per tree memory
  * (it is accessed via `_treeMemory[id].nodeMemory`). Avoid to use these
  * variables manually, use `get` and `set` instead.
  *
  */
@JSGlobal("b3.Blackboard")
@js.native
/**
  * Initialization method.
  */
class Blackboard ()
  extends typings.behavior3.b3.Blackboard


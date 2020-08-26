package typings.behavior3.b3

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
@js.native
trait Blackboard extends js.Object {
  /**
    * Internal method to retrieve the context memory. If treeScope and
    * nodeScope are provided, this method returns the per node per tree
    * memory. If only the treeScope is provided, it returns the per tree
    * memory. If no parameter is provided, it returns the global memory.
    * Notice that, if only nodeScope is provided, this method will still
    * return the global memory.
    *
    */
  def _getMemory(treeScope: String, nodeScope: String): js.Any = js.native
  /**
    * Internal method to retrieve the node context memory, given the tree
    * memory. If the memory does not exist, this method creates is.
    *
    */
  def _getNodeMemory(treeMemory: String, nodeScope: String): js.Any = js.native
  /**
    * Internal method to retrieve the tree context memory. If the memory does
    * not exist, this method creates it.
    *
    */
  def _getTreeMemory(treeScope: String): js.Any = js.native
  /**
    * Retrieves a value in the blackboard. If treeScope and nodeScope are
    * provided, this method will retrieve the value from the per node per tree
    * memory. If only the treeScope is provided, it will retrieve the value
    * from the per tree memory. If no parameter is provided, this method will
    * retrieve from the global memory. If only nodeScope is provided (but
    * treeScope not), this method will still try to retrieve from the global
    * memory.
    *
    */
  def get(key: String, treeScope: String, nodeScope: String): js.Any = js.native
  /**
    * Stores a value in the blackboard. If treeScope and nodeScope are
    * provided, this method will save the value into the per node per tree
    * memory. If only the treeScope is provided, it will save the value into
    * the per tree memory. If no parameter is provided, this method will save
    * the value into the global memory. Notice that, if only nodeScope is
    * provided (but treeScope not), this method will still save the value into
    * the global memory.
    *
    */
  def set(key: String, value: String, treeScope: String, nodeScope: String): Unit = js.native
}

object Blackboard {
  @scala.inline
  def apply(
    _getMemory: (String, String) => js.Any,
    _getNodeMemory: (String, String) => js.Any,
    _getTreeMemory: String => js.Any,
    get: (String, String, String) => js.Any,
    set: (String, String, String, String) => Unit
  ): Blackboard = {
    val __obj = js.Dynamic.literal(_getMemory = js.Any.fromFunction2(_getMemory), _getNodeMemory = js.Any.fromFunction2(_getNodeMemory), _getTreeMemory = js.Any.fromFunction1(_getTreeMemory), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[Blackboard]
  }
  @scala.inline
  implicit class BlackboardOps[Self <: Blackboard] (val x: Self) extends AnyVal {
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
    def set_getMemory(value: (String, String) => js.Any): Self = this.set("_getMemory", js.Any.fromFunction2(value))
    @scala.inline
    def set_getNodeMemory(value: (String, String) => js.Any): Self = this.set("_getNodeMemory", js.Any.fromFunction2(value))
    @scala.inline
    def set_getTreeMemory(value: String => js.Any): Self = this.set("_getTreeMemory", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: (String, String, String) => js.Any): Self = this.set("get", js.Any.fromFunction3(value))
    @scala.inline
    def setSet(value: (String, String, String, String) => Unit): Self = this.set("set", js.Any.fromFunction4(value))
  }
  
}


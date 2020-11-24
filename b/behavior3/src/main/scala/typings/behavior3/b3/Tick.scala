package typings.behavior3.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A new Tick object is instantiated every tick by BehaviorTree. It is passed
  * as parameter to the nodes through the tree during the traversal.
  *
  * The role of the Tick class is to store the instances of tree, debug,
  * target and blackboard. So, all nodes can access these informations.
  *
  * For internal uses, the Tick also is useful to store the open node after
  * the tick signal, in order to let `BehaviorTree` to keep track and close
  * them when necessary.
  *
  * This class also makes a bridge between nodes and the debug, passing the
  * node state to the debug if the last is provided.
  *
  */
@js.native
trait Tick extends js.Object {
  
  /**
    * Callback when closing a node (called by BaseNode).
    */
  def _closeNode(node: js.Any): Unit = js.native
  
  /**
    * Called when entering a node (called by BaseNode).
    */
  def _enterNode(node: js.Any): Unit = js.native
  
  /**
    * Callback when exiting a node (called by BaseNode).
    */
  def _exitNode(node: js.Any): Unit = js.native
  
  /**
    * Callback when opening a node (called by BaseNode).
    */
  def _openNode(node: js.Any): Unit = js.native
  
  /**
    * Callback when ticking a node (called by BaseNode).
    */
  def _tickNode(node: js.Any): Unit = js.native
}
object Tick {
  
  @scala.inline
  def apply(
    _closeNode: js.Any => Unit,
    _enterNode: js.Any => Unit,
    _exitNode: js.Any => Unit,
    _openNode: js.Any => Unit,
    _tickNode: js.Any => Unit
  ): Tick = {
    val __obj = js.Dynamic.literal(_closeNode = js.Any.fromFunction1(_closeNode), _enterNode = js.Any.fromFunction1(_enterNode), _exitNode = js.Any.fromFunction1(_exitNode), _openNode = js.Any.fromFunction1(_openNode), _tickNode = js.Any.fromFunction1(_tickNode))
    __obj.asInstanceOf[Tick]
  }
  
  @scala.inline
  implicit class TickOps[Self <: Tick] (val x: Self) extends AnyVal {
    
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
    def set_closeNode(value: js.Any => Unit): Self = this.set("_closeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_enterNode(value: js.Any => Unit): Self = this.set("_enterNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_exitNode(value: js.Any => Unit): Self = this.set("_exitNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_openNode(value: js.Any => Unit): Self = this.set("_openNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_tickNode(value: js.Any => Unit): Self = this.set("_tickNode", js.Any.fromFunction1(value))
  }
}

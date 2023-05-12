package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantiatedEntries extends StObject {
  
  /**
    * List of new animation groups
    */
  var animationGroups: js.Array[AnimationGroup]
  
  /**
    * Disposes the instantiated entries from the scene
    */
  def dispose(): Unit
  
  /**
    * List of new root nodes (eg. nodes with no parent)
    */
  var rootNodes: js.Array[Node]
  
  /**
    * List of new skeletons
    */
  var skeletons: js.Array[Skeleton]
}
object InstantiatedEntries {
  
  inline def apply(
    animationGroups: js.Array[AnimationGroup],
    dispose: () => Unit,
    rootNodes: js.Array[Node],
    skeletons: js.Array[Skeleton]
  ): InstantiatedEntries = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantiatedEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstantiatedEntries] (val x: Self) extends AnyVal {
    
    inline def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
    
    inline def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value*))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setRootNodes(value: js.Array[Node]): Self = StObject.set(x, "rootNodes", value.asInstanceOf[js.Any])
    
    inline def setRootNodesVarargs(value: Node*): Self = StObject.set(x, "rootNodes", js.Array(value*))
    
    inline def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
    
    inline def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value*))
  }
}

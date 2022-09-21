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
    * List of new root nodes (eg. nodes with no parent)
    */
  var rootNodes: js.Array[TransformNode]
  
  /**
    * List of new skeletons
    */
  var skeletons: js.Array[Skeleton]
}
object InstantiatedEntries {
  
  inline def apply(
    animationGroups: js.Array[AnimationGroup],
    rootNodes: js.Array[TransformNode],
    skeletons: js.Array[Skeleton]
  ): InstantiatedEntries = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantiatedEntries]
  }
  
  extension [Self <: InstantiatedEntries](x: Self) {
    
    inline def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
    
    inline def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value*))
    
    inline def setRootNodes(value: js.Array[TransformNode]): Self = StObject.set(x, "rootNodes", value.asInstanceOf[js.Any])
    
    inline def setRootNodesVarargs(value: TransformNode*): Self = StObject.set(x, "rootNodes", js.Array(value*))
    
    inline def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
    
    inline def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value*))
  }
}

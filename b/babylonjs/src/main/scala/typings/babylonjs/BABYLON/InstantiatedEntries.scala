package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantiatedEntries extends js.Object {
  
  /**
    * List of new animation groups
    */
  var animationGroups: js.Array[AnimationGroup] = js.native
  
  /**
    * List of new root nodes (eg. nodes with no parent)
    */
  var rootNodes: js.Array[TransformNode] = js.native
  
  /**
    * List of new skeletons
    */
  var skeletons: js.Array[Skeleton] = js.native
}
object InstantiatedEntries {
  
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    rootNodes: js.Array[TransformNode],
    skeletons: js.Array[Skeleton]
  ): InstantiatedEntries = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantiatedEntries]
  }
  
  @scala.inline
  implicit class InstantiatedEntriesOps[Self <: InstantiatedEntries] (val x: Self) extends AnyVal {
    
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
    def setAnimationGroupsVarargs(value: AnimationGroup*): Self = this.set("animationGroups", js.Array(value :_*))
    
    @scala.inline
    def setAnimationGroups(value: js.Array[AnimationGroup]): Self = this.set("animationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodesVarargs(value: TransformNode*): Self = this.set("rootNodes", js.Array(value :_*))
    
    @scala.inline
    def setRootNodes(value: js.Array[TransformNode]): Self = this.set("rootNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonsVarargs(value: Skeleton*): Self = this.set("skeletons", js.Array(value :_*))
    
    @scala.inline
    def setSkeletons(value: js.Array[Skeleton]): Self = this.set("skeletons", value.asInstanceOf[js.Any])
  }
}

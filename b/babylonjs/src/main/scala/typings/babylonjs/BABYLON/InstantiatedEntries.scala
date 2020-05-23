package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiatedEntries extends js.Object {
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
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    rootNodes: js.Array[TransformNode],
    skeletons: js.Array[Skeleton]
  ): InstantiatedEntries = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantiatedEntries]
  }
}


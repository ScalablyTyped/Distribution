package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InstantiatedEntries")
@js.native
class InstantiatedEntries () extends js.Object {
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


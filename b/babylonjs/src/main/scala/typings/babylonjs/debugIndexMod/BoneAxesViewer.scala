package typings.babylonjs.debugIndexMod

import typings.babylonjs.boneMod.Bone
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Debug/index", "BoneAxesViewer")
@js.native
class BoneAxesViewer protected ()
  extends typings.babylonjs.boneAxesViewerMod.BoneAxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(scene: Scene, bone: Bone, mesh: Mesh) = this()
  def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double) = this()
}


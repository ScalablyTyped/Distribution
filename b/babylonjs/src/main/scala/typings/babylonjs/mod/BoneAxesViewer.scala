package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BoneAxesViewer")
@js.native
open class BoneAxesViewer protected ()
  extends typings.babylonjs.legacyMod.BoneAxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bone: typings.babylonjs.boneMod.Bone,
    mesh: typings.babylonjs.meshMod.Mesh
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    bone: typings.babylonjs.boneMod.Bone,
    mesh: typings.babylonjs.meshMod.Mesh,
    scaleLines: Double
  ) = this()
}

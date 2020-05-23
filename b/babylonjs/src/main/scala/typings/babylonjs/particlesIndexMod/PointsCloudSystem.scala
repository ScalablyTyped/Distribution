package typings.babylonjs.particlesIndexMod

import typings.babylonjs.anon.UpdatableBoolean
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "PointsCloudSystem")
@js.native
class PointsCloudSystem protected ()
  extends typings.babylonjs.pointsCloudSystemMod.PointsCloudSystem {
  /**
    * Creates a PCS (Points Cloud System) object
    * @param name (String) is the PCS name, this will be the underlying mesh name
    * @param pointSize (number) is the size for each point
    * @param scene (Scene) is the scene in which the PCS is added
    * @param options defines the options of the PCS e.g.
    * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
    */
  def this(name: String, pointSize: Double, scene: Scene) = this()
  def this(name: String, pointSize: Double, scene: Scene, options: UpdatableBoolean) = this()
}


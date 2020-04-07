package typings.babylonjs.particlesIndexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "PointsGroup")
@js.native
class PointsGroup protected ()
  extends typings.babylonjs.cloudPointMod.PointsGroup {
  /**
    * Creates a points group object. This is an internal reference to produce particles for the PCS.
    * PCS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.cloudPointMod.CloudPoint, 
          /* i */ js.UndefOr[Double], 
          /* s */ js.UndefOr[Double], 
          Unit
        ]
      ]
  ) = this()
}


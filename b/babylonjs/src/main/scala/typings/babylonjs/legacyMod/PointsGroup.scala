package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PointsGroup")
@js.native
class PointsGroup protected ()
  extends typings.babylonjs.indexMod.PointsGroup {
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


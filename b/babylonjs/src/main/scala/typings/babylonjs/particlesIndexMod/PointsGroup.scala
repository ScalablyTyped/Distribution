package typings.babylonjs.particlesIndexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "PointsGroup")
@js.native
open class PointsGroup protected ()
  extends typings.babylonjs.particlesCloudPointMod.PointsGroup {
  /**
    * Creates a points group object. This is an internal reference to produce particles for the PCS.
    * PCS internal tool, don't use it manually.
    * @internal
    */
  def this(
    id: Double,
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.particlesCloudPointMod.CloudPoint, 
          /* i */ js.UndefOr[Double], 
          /* s */ js.UndefOr[Double], 
          Unit
        ]
      ]
  ) = this()
}

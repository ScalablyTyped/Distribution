package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LightingModel extends StObject
@JSImport("cesium", "LightingModel")
@js.native
object LightingModel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LightingModel & Double] = js.native
  
  /**
    * Use physically-based rendering lighting calculations. This includes
    * both PBR metallic roughness and PBR specular glossiness. Image-based
    * lighting is also applied when possible.
    */
  @js.native
  sealed trait PBR
    extends StObject
       with LightingModel
  /* 1 */ val PBR: typings.cesium.mod.LightingModel.PBR & Double = js.native
  
  /**
    * Use unlit shading, i.e. skip lighting calculations. The model's
    * diffuse color (assumed to be linear RGB, not sRGB) is used directly
    * when computing <code>out_FragColor</code>. The alpha mode is still
    * applied.
    */
  @js.native
  sealed trait UNLIT
    extends StObject
       with LightingModel
  /* 0 */ val UNLIT: typings.cesium.mod.LightingModel.UNLIT & Double = js.native
}

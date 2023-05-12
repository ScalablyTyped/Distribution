package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PostProcessStageSampleMode extends StObject
@JSImport("@cesium/engine", "PostProcessStageSampleMode")
@js.native
object PostProcessStageSampleMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PostProcessStageSampleMode & Double] = js.native
  
  /**
    * Samples the texture through bi-linear interpolation of the four nearest texels.
    */
  @js.native
  sealed trait LINEAR
    extends StObject
       with PostProcessStageSampleMode
  /* 1 */ val LINEAR: typings.cesiumEngine.mod.PostProcessStageSampleMode.LINEAR & Double = js.native
  
  /**
    * Samples the texture by returning the closest texel.
    */
  @js.native
  sealed trait NEAREST
    extends StObject
       with PostProcessStageSampleMode
  /* 0 */ val NEAREST: typings.cesiumEngine.mod.PostProcessStageSampleMode.NEAREST & Double = js.native
}

package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomShaderTranslucencyMode extends StObject
@JSImport("cesium", "CustomShaderTranslucencyMode")
@js.native
object CustomShaderTranslucencyMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomShaderTranslucencyMode & Double] = js.native
  
  /**
    * Inherit translucency settings from the primitive's material. If the primitive used a
    * translucent material, the custom shader will also be considered translucent. If the primitive
    * used an opaque material, the custom shader will be considered opaque.
    */
  @js.native
  sealed trait INHERIT
    extends StObject
       with CustomShaderTranslucencyMode
  /* 0 */ val INHERIT: typings.cesium.mod.CustomShaderTranslucencyMode.INHERIT & Double = js.native
  
  /**
    * Force the primitive to render the primitive as opaque, ignoring any material settings.
    */
  @js.native
  sealed trait OPAQUE
    extends StObject
       with CustomShaderTranslucencyMode
  /* 1 */ val OPAQUE: typings.cesium.mod.CustomShaderTranslucencyMode.OPAQUE & Double = js.native
  
  /**
    * Force the primitive to render the primitive as translucent, ignoring any material settings.
    */
  @js.native
  sealed trait TRANSLUCENT
    extends StObject
       with CustomShaderTranslucencyMode
  /* 2 */ val TRANSLUCENT: typings.cesium.mod.CustomShaderTranslucencyMode.TRANSLUCENT & Double = js.native
}

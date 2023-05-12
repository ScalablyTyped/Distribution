package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomShaderMode extends StObject
@JSImport("@cesium/engine", "CustomShaderMode")
@js.native
object CustomShaderMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomShaderMode & String] = js.native
  
  /**
    * The custom shader will be used to modify the results of the material stage
    * before lighting is applied.
    */
  @js.native
  sealed trait MODIFY_MATERIAL
    extends StObject
       with CustomShaderMode
  /* "MODIFY_MATERIAL" */ val MODIFY_MATERIAL: typings.cesiumEngine.mod.CustomShaderMode.MODIFY_MATERIAL & String = js.native
  
  /**
    * The custom shader will be used instead of the material stage. This is a hint
    * to optimize out the material processing code.
    */
  @js.native
  sealed trait REPLACE_MATERIAL
    extends StObject
       with CustomShaderMode
  /* "REPLACE_MATERIAL" */ val REPLACE_MATERIAL: typings.cesiumEngine.mod.CustomShaderMode.REPLACE_MATERIAL & String = js.native
}

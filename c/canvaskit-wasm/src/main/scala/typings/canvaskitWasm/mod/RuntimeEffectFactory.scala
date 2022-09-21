package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeEffectFactory extends StObject {
  
  /**
    * Compiles a RuntimeEffect from the given shader code.
    * @param sksl - Source code for a shader written in SkSL
    * @param callback - will be called with any compilation error. If not provided, errors will
    *                   be printed to console.log().
    */
  def Make(sksl: String): RuntimeEffect | Null = js.native
  def Make(sksl: String, callback: js.Function1[/* err */ String, Unit]): RuntimeEffect | Null = js.native
  
  /**
    * Adds debug tracing to an existing RuntimeEffect.
    * @param shader - An already-assembled shader, created with RuntimeEffect.makeShader.
    * @param traceCoordX - the X coordinate of the device-space pixel to trace
    * @param traceCoordY - the Y coordinate of the device-space pixel to trace
    */
  def MakeTraced(shader: Shader, traceCoordX: Double, traceCoordY: Double): TracedShader = js.native
}

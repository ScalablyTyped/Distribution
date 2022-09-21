package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShaderLanguage extends StObject
@JSGlobal("BABYLON.ShaderLanguage")
@js.native
object ShaderLanguage extends StObject {
  
  /** language is GLSL (used by WebGL) */
  @js.native
  sealed trait GLSL
    extends StObject
       with ShaderLanguage
  
  /** language is WGSL (used by WebGPU) */
  @js.native
  sealed trait WGSL
    extends StObject
       with ShaderLanguage
}

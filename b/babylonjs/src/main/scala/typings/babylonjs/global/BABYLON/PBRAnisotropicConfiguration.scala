package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMaterialAnisotropicDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRAnisotropicConfiguration")
@js.native
class PBRAnisotropicConfiguration protected ()
  extends typings.babylonjs.BABYLON.PBRAnisotropicConfiguration {
  /**
    * Instantiate a new istance of anisotropy configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
}
/* static members */
object PBRAnisotropicConfiguration {
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  @JSGlobal("BABYLON.PBRAnisotropicConfiguration.AddFallbacks")
  @js.native
  def AddFallbacks(
    defines: IMaterialAnisotropicDefines,
    fallbacks: typings.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  @JSGlobal("BABYLON.PBRAnisotropicConfiguration.AddSamplers")
  @js.native
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  @JSGlobal("BABYLON.PBRAnisotropicConfiguration.AddUniforms")
  @js.native
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  @JSGlobal("BABYLON.PBRAnisotropicConfiguration.PrepareUniformBuffer")
  @js.native
  def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = js.native
}

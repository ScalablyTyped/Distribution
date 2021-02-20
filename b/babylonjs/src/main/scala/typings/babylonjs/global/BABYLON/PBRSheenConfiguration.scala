package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMaterialSheenDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRSheenConfiguration")
@js.native
class PBRSheenConfiguration protected ()
  extends typings.babylonjs.BABYLON.PBRSheenConfiguration {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
}
/* static members */
object PBRSheenConfiguration {
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  @JSGlobal("BABYLON.PBRSheenConfiguration.AddFallbacks")
  @js.native
  def AddFallbacks(
    defines: IMaterialSheenDefines,
    fallbacks: typings.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  @JSGlobal("BABYLON.PBRSheenConfiguration.AddSamplers")
  @js.native
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  @JSGlobal("BABYLON.PBRSheenConfiguration.AddUniforms")
  @js.native
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  @JSGlobal("BABYLON.PBRSheenConfiguration.PrepareUniformBuffer")
  @js.native
  def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = js.native
}

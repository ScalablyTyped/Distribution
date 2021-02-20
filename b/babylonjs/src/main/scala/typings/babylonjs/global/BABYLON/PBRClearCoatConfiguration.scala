package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMaterialClearCoatDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRClearCoatConfiguration")
@js.native
class PBRClearCoatConfiguration protected ()
  extends typings.babylonjs.BABYLON.PBRClearCoatConfiguration {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
}
/* static members */
object PBRClearCoatConfiguration {
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration.AddFallbacks")
  @js.native
  def AddFallbacks(
    defines: IMaterialClearCoatDefines,
    fallbacks: typings.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration.AddSamplers")
  @js.native
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration.AddUniforms")
  @js.native
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration.PrepareUniformBuffer")
  @js.native
  def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = js.native
  
  /**
    * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
    * The default fits with a polyurethane material.
    * @hidden
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration._DefaultIndexOfRefraction")
  @js.native
  val _DefaultIndexOfRefraction: Double = js.native
}

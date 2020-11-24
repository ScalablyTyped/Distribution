package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMaterialSubSurfaceDefines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRSubSurfaceConfiguration")
@js.native
class PBRSubSurfaceConfiguration protected ()
  extends typings.babylonjs.BABYLON.PBRSubSurfaceConfiguration {
  /**
    * Instantiate a new istance of sub surface configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    * @param markScenePrePassDirty Callback to flag the scene as prepass dirty
    * @param scene The scene
    */
  def this(
    markAllSubMeshesAsTexturesDirty: js.Function0[Unit],
    markScenePrePassDirty: js.Function0[Unit],
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.PBRSubSurfaceConfiguration")
@js.native
object PBRSubSurfaceConfiguration extends js.Object {
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  def AddFallbacks(
    defines: IMaterialSubSurfaceDefines,
    fallbacks: typings.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = js.native
}

package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMaterialSubSurfaceDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRSubSurfaceConfiguration")
@js.native
class PBRSubSurfaceConfiguration protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PBRSubSurfaceConfiguration {
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
object PBRSubSurfaceConfiguration {
  
  @JSGlobal("BABYLON.PBRSubSurfaceConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  inline def AddFallbacks(
    defines: IMaterialSubSurfaceDefines,
    fallbacks: typings.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFallbacks")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], currentRank.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  inline def AddSamplers(samplers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddSamplers")(samplers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  inline def AddUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  inline def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformBuffer")(uniformBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

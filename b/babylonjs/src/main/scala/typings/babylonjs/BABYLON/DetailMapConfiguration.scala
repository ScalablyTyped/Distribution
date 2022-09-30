package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailMapConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /** @internal */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @internal */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _normalBlendMethod: Any = js.native
  
  /* private */ var _texture: Any = js.native
  
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene): Unit = js.native
  
  /**
    * Defines how strong the bump effect from the detail map is
    * Bigger values mean stronger effect
    */
  var bumpLevel: Double = js.native
  
  /**
    * Defines how strongly the detail diffuse/albedo channel is blended with the regular diffuse/albedo texture
    * Bigger values mean stronger blending
    */
  var diffuseBlendLevel: Double = js.native
  
  /**
    * Enable or disable the detail map on this material
    */
  var isEnabled: Boolean = js.native
  
  def isReadyForSubMesh(defines: MaterialDetailMapDefines, scene: Scene, engine: Engine): Boolean = js.native
  
  /**
    * The method used to blend the bump and detail normals together
    */
  var normalBlendMethod: Double = js.native
  
  def prepareDefines(defines: MaterialDetailMapDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines how strongly the detail roughness channel is blended with the regular roughness value
    * Bigger values mean stronger blending. Only used with PBR materials
    */
  var roughnessBlendLevel: Double = js.native
  
  /**
    * The detail texture of the material.
    */
  var texture: Nullable[BaseTexture] = js.native
}

package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMaterialDotdetailMapConfigurationMod {
  
  @JSImport("babylonjs/Materials/material.detailMapConfiguration", "DetailMapConfiguration")
  @js.native
  open class DetailMapConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: StandardMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    def this(material: StandardMaterial, addToPluginList: Boolean) = this()
    
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
  
  @JSImport("babylonjs/Materials/material.detailMapConfiguration", "MaterialDetailMapDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialDetailMapDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var DETAIL: Boolean = js.native
    
    var DETAILDIRECTUV: Double = js.native
    
    var DETAIL_NORMALBLENDMETHOD: Double = js.native
  }
}

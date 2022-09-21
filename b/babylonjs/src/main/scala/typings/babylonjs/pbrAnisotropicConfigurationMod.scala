package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Default
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrAnisotropicConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "MaterialAnisotropicDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialAnisotropicDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var ANISOTROPIC: Boolean = js.native
    
    var ANISOTROPIC_TEXTURE: Boolean = js.native
    
    var ANISOTROPIC_TEXTUREDIRECTUV: Double = js.native
    
    var MAINUV1: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "PBRAnisotropicConfiguration")
  @js.native
  open class PBRAnisotropicConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _texture: Any = js.native
    
    def addFallbacks(defines: MaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene): Unit = js.native
    
    /**
      * Defines if the effect is along the tangents, bitangents or in between.
      * By default, the effect is "stretching" the highlights along the tangents.
      */
    var direction: Vector2 = js.native
    
    /**
      * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the anisotropy is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: MaterialAnisotropicDefines, scene: Scene): Boolean = js.native
    
    def prepareDefinesBeforeAttributes(defines: MaterialAnisotropicDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
    
    /**
      * Stores the anisotropy values in a texture.
      * rg is direction (like normal from -1 to 1)
      * b is a intensity
      */
    var texture: Nullable[BaseTexture] = js.native
  }
}

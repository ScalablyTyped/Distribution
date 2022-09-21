package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrIridescenceConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrIridescenceConfiguration", "MaterialIridescenceDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialIridescenceDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var IRIDESCENCE: Boolean = js.native
    
    var IRIDESCENCE_TEXTURE: Boolean = js.native
    
    var IRIDESCENCE_TEXTUREDIRECTUV: Double = js.native
    
    var IRIDESCENCE_THICKNESS_TEXTURE: Boolean = js.native
    
    var IRIDESCENCE_THICKNESS_TEXTUREDIRECTUV: Double = js.native
    
    var IRIDESCENCE_USE_THICKNESS_FROM_MAINTEXTURE: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrIridescenceConfiguration", "PBRIridescenceConfiguration")
  @js.native
  open class PBRIridescenceConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* protected */ @JSName("_material")
    var _material_PBRIridescenceConfiguration: PBRBaseMaterial = js.native
    
    /* private */ var _texture: Any = js.native
    
    /* private */ var _thicknessTexture: Any = js.native
    
    def addFallbacks(defines: MaterialIridescenceDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    /**
      * Defines the maximum thickness of the thin-film layer given in nanometers (nm).
      */
    var indexOfRefraction: Double = js.native
    
    /**
      * Defines the iridescence layer strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the iridescence is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: MaterialIridescenceDefines, scene: Scene): Boolean = js.native
    
    /**
      * Defines the maximum thickness of the thin-film layer given in nanometers (nm). This will be the thickness used if not thickness texture has been set.
      */
    var maximumThickness: Double = js.native
    
    /**
      * Defines the minimum thickness of the thin-film layer given in nanometers (nm).
      */
    var minimumThickness: Double = js.native
    
    def prepareDefinesBeforeAttributes(defines: MaterialIridescenceDefines, scene: Scene): Unit = js.native
    
    /**
      * Stores the iridescence intensity in a texture (red channel)
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * Stores the iridescence thickness in a texture (green channel)
      */
    var thicknessTexture: Nullable[BaseTexture] = js.native
  }
  /* static members */
  object PBRIridescenceConfiguration {
    
    /**
      * The default index of refraction of the thin-film layer.
      * Defaults to 1.3
      * @hidden
      */
    @JSImport("babylonjs/Materials/PBR/pbrIridescenceConfiguration", "PBRIridescenceConfiguration._DefaultIndexOfRefraction")
    @js.native
    val _DefaultIndexOfRefraction: Double = js.native
    
    /**
      * The default maximum thickness of the thin-film layer given in nanometers (nm).
      * Defaults to 400 nm.
      * @hidden
      */
    @JSImport("babylonjs/Materials/PBR/pbrIridescenceConfiguration", "PBRIridescenceConfiguration._DefaultMaximumThickness")
    @js.native
    val _DefaultMaximumThickness: Double = js.native
    
    /**
      * The default minimum thickness of the thin-film layer given in nanometers (nm).
      * Defaults to 100 nm.
      * @hidden
      */
    @JSImport("babylonjs/Materials/PBR/pbrIridescenceConfiguration", "PBRIridescenceConfiguration._DefaultMinimumThickness")
    @js.native
    val _DefaultMinimumThickness: Double = js.native
  }
}

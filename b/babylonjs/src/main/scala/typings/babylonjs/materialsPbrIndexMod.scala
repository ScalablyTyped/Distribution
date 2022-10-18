package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrIndexMod {
  
  @JSImport("babylonjs/Materials/PBR/index", "MaterialAnisotropicDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialAnisotropicDefines ()
    extends typings.babylonjs.materialsPbrPbrAnisotropicConfigurationMod.MaterialAnisotropicDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "MaterialClearCoatDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialClearCoatDefines ()
    extends typings.babylonjs.materialsPbrPbrClearCoatConfigurationMod.MaterialClearCoatDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "MaterialIridescenceDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialIridescenceDefines ()
    extends typings.babylonjs.materialsPbrPbrIridescenceConfigurationMod.MaterialIridescenceDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "MaterialSheenDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialSheenDefines ()
    extends typings.babylonjs.materialsPbrPbrSheenConfigurationMod.MaterialSheenDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "MaterialSubSurfaceDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialSubSurfaceDefines ()
    extends typings.babylonjs.materialsPbrPbrSubSurfaceConfigurationMod.MaterialSubSurfaceDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRAnisotropicConfiguration")
  @js.native
  open class PBRAnisotropicConfiguration protected ()
    extends typings.babylonjs.materialsPbrPbrAnisotropicConfigurationMod.PBRAnisotropicConfiguration {
    def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
    def this(
      material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
      addToPluginList: Boolean
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial")
  @js.native
  open class PBRBaseMaterial protected ()
    extends typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRBaseMaterial {
    
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
    @js.native
    def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    inline def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
    
    /**
      * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.LIGHTFALLOFF_GLTF")
    @js.native
    val LIGHTFALLOFF_GLTF: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.LIGHTFALLOFF_PHYSICAL")
    @js.native
    val LIGHTFALLOFF_PHYSICAL: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.LIGHTFALLOFF_STANDARD")
    @js.native
    val LIGHTFALLOFF_STANDARD: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.PBRMATERIAL_ALPHABLEND")
    @js.native
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.PBRMATERIAL_ALPHATEST")
    @js.native
    val PBRMATERIAL_ALPHATEST: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
    @js.native
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial.PBRMATERIAL_OPAQUE")
    @js.native
    val PBRMATERIAL_OPAQUE: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("babylonjs/Materials/PBR/index", "PBRBaseSimpleMaterial")
  @js.native
  open class PBRBaseSimpleMaterial protected ()
    extends typings.babylonjs.materialsPbrPbrBaseSimpleMaterialMod.PBRBaseSimpleMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRClearCoatConfiguration")
  @js.native
  open class PBRClearCoatConfiguration protected ()
    extends typings.babylonjs.materialsPbrPbrClearCoatConfigurationMod.PBRClearCoatConfiguration {
    def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
    def this(
      material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
      addToPluginList: Boolean
    ) = this()
  }
  /* static members */
  object PBRClearCoatConfiguration {
    
    /**
      * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
      * The default fits with a polyurethane material.
      * @internal
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRClearCoatConfiguration._DefaultIndexOfRefraction")
    @js.native
    val _DefaultIndexOfRefraction: Double = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRIridescenceConfiguration")
  @js.native
  open class PBRIridescenceConfiguration protected ()
    extends typings.babylonjs.materialsPbrPbrIridescenceConfigurationMod.PBRIridescenceConfiguration {
    def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
    def this(
      material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
      addToPluginList: Boolean
    ) = this()
  }
  /* static members */
  object PBRIridescenceConfiguration {
    
    /**
      * The default index of refraction of the thin-film layer.
      * Defaults to 1.3
      * @internal
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRIridescenceConfiguration._DefaultIndexOfRefraction")
    @js.native
    val _DefaultIndexOfRefraction: Double = js.native
    
    /**
      * The default maximum thickness of the thin-film layer given in nanometers (nm).
      * Defaults to 400 nm.
      * @internal
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRIridescenceConfiguration._DefaultMaximumThickness")
    @js.native
    val _DefaultMaximumThickness: Double = js.native
    
    /**
      * The default minimum thickness of the thin-film layer given in nanometers (nm).
      * Defaults to 100 nm.
      * @internal
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRIridescenceConfiguration._DefaultMinimumThickness")
    @js.native
    val _DefaultMinimumThickness: Double = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial")
  @js.native
  open class PBRMaterial protected ()
    extends typings.babylonjs.materialsPbrPbrMaterialMod.PBRMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRMaterial {
    
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
    @js.native
    def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    inline def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.PBRMATERIAL_ALPHABLEND")
    @js.native
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.PBRMATERIAL_ALPHATEST")
    @js.native
    val PBRMATERIAL_ALPHATEST: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
    @js.native
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.PBRMATERIAL_OPAQUE")
    @js.native
    val PBRMATERIAL_OPAQUE: Double = js.native
    
    /**
      * Parses a PBR Material from a serialized object.
      * @param source - Serialized object.
      * @param scene - BJS scene instance.
      * @param rootUrl - url for the scene object
      * @returns - PBRMaterial
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.materialsPbrPbrMaterialMod.PBRMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsPbrPbrMaterialMod.PBRMaterial]
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMaterialDefines")
  @js.native
  /**
    * Initializes the PBR Material defines.
    * @param externalProperties The external properties
    */
  open class PBRMaterialDefines ()
    extends typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRMaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMetallicRoughnessMaterial")
  @js.native
  open class PBRMetallicRoughnessMaterial protected ()
    extends typings.babylonjs.materialsPbrPbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial {
    /**
      * Instantiates a new PBRMetalRoughnessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRMetallicRoughnessMaterial {
    
    @JSImport("babylonjs/Materials/PBR/index", "PBRMetallicRoughnessMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object corresponding to the serialize function.
      * @param source
      * @param scene
      * @param rootUrl
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.materialsPbrPbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsPbrPbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial]
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRSheenConfiguration")
  @js.native
  open class PBRSheenConfiguration protected ()
    extends typings.babylonjs.materialsPbrPbrSheenConfigurationMod.PBRSheenConfiguration {
    def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
    def this(
      material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
      addToPluginList: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRSpecularGlossinessMaterial")
  @js.native
  open class PBRSpecularGlossinessMaterial protected ()
    extends typings.babylonjs.materialsPbrPbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial {
    /**
      * Instantiates a new PBRSpecularGlossinessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRSpecularGlossinessMaterial {
    
    @JSImport("babylonjs/Materials/PBR/index", "PBRSpecularGlossinessMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object corresponding to the serialize function.
      * @param source
      * @param scene
      * @param rootUrl
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.materialsPbrPbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsPbrPbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial]
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRSubSurfaceConfiguration")
  @js.native
  open class PBRSubSurfaceConfiguration protected ()
    extends typings.babylonjs.materialsPbrPbrSubSurfaceConfigurationMod.PBRSubSurfaceConfiguration {
    def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
    def this(
      material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
      addToPluginList: Boolean
    ) = this()
  }
}

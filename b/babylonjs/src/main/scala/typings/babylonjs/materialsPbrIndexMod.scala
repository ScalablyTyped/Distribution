package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrIndexMod {
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRBaseMaterial")
  @js.native
  abstract class PBRBaseMaterial protected ()
    extends typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
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
    @scala.inline
    def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
    
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
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRBaseSimpleMaterial")
  @js.native
  abstract class PBRBaseSimpleMaterial protected ()
    extends typings.babylonjs.pbrBaseSimpleMaterialMod.PBRBaseSimpleMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial")
  @js.native
  class PBRMaterial protected ()
    extends typings.babylonjs.pbrMaterialMod.PBRMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
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
    @scala.inline
    def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
    
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
    @JSImport("babylonjs/Materials/PBR/index", "PBRMaterial.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrMaterialMod.PBRMaterial = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMaterialDefines")
  @js.native
  /**
    * Initializes the PBR Material defines.
    */
  class PBRMaterialDefines ()
    extends typings.babylonjs.pbrBaseMaterialMod.PBRMaterialDefines
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRMetallicRoughnessMaterial")
  @js.native
  class PBRMetallicRoughnessMaterial protected ()
    extends typings.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial {
    /**
      * Instantiates a new PBRMetalRoughnessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRMetallicRoughnessMaterial {
    
    /**
      * Parses a JSON object correponding to the serialize function.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRMetallicRoughnessMaterial.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/index", "PBRSpecularGlossinessMaterial")
  @js.native
  class PBRSpecularGlossinessMaterial protected ()
    extends typings.babylonjs.pbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial {
    /**
      * Instantiates a new PBRSpecularGlossinessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object PBRSpecularGlossinessMaterial {
    
    /**
      * Parses a JSON object correponding to the serialize function.
      */
    @JSImport("babylonjs/Materials/PBR/index", "PBRSpecularGlossinessMaterial.Parse")
    @js.native
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = js.native
  }
}

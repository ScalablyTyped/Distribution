package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/PBR/index", JSImport.Namespace)
@js.native
object materialsPbrIndexMod extends js.Object {
  
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
  @js.native
  object PBRBaseMaterial extends js.Object {
    
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    
    /**
      * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    val LIGHTFALLOFF_GLTF: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
      */
    val LIGHTFALLOFF_PHYSICAL: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    val LIGHTFALLOFF_STANDARD: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    val PBRMATERIAL_ALPHATEST: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    val PBRMATERIAL_OPAQUE: Double = js.native
  }
  
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
  @js.native
  object PBRMaterial extends js.Object {
    
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    val PBRMATERIAL_ALPHATEST: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    val PBRMATERIAL_OPAQUE: Double = js.native
    
    /**
      * Parses a PBR Material from a serialized object.
      * @param source - Serialized object.
      * @param scene - BJS scene instance.
      * @param rootUrl - url for the scene object
      * @returns - PBRMaterial
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrMaterialMod.PBRMaterial = js.native
  }
  
  @js.native
  /**
    * Initializes the PBR Material defines.
    */
  class PBRMaterialDefines ()
    extends typings.babylonjs.pbrBaseMaterialMod.PBRMaterialDefines
  
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
  @js.native
  object PBRMetallicRoughnessMaterial extends js.Object {
    
    /**
      * Parses a JSON object correponding to the serialize function.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = js.native
  }
  
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
  @js.native
  object PBRSpecularGlossinessMaterial extends js.Object {
    
    /**
      * Parses a JSON object correponding to the serialize function.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = js.native
  }
}

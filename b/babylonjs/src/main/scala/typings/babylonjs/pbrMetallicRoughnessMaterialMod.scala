package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.pbrBaseSimpleMaterialMod.PBRBaseSimpleMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrMetallicRoughnessMaterialMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrMetallicRoughnessMaterial", "PBRMetallicRoughnessMaterial")
  @js.native
  open class PBRMetallicRoughnessMaterial protected () extends PBRBaseSimpleMaterial {
    /**
      * Instantiates a new PBRMetalRoughnessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    
    /**
      * The base color has two different interpretations depending on the value of metalness.
      * When the material is a metal, the base color is the specific measured reflectance value
      * at normal incidence (F0). For a non-metal the base color represents the reflected diffuse color
      * of the material.
      */
    var baseColor: Color3 = js.native
    
    /**
      * Base texture of the metallic workflow. It contains both the baseColor information in RGB as
      * well as opacity information in the alpha channel.
      */
    var baseTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Specifies the metallic scalar value of the material.
      * Can also be used to scale the metalness values of the metallic texture.
      */
    var metallic: Double = js.native
    
    /**
      * Texture containing both the metallic value in the B channel and the
      * roughness value in the G channel to keep better precision.
      */
    var metallicRoughnessTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Specifies the roughness scalar value of the material.
      * Can also be used to scale the roughness values of the metallic texture.
      */
    var roughness: Double = js.native
  }
  /* static members */
  object PBRMetallicRoughnessMaterial {
    
    @JSImport("babylonjs/Materials/PBR/pbrMetallicRoughnessMaterial", "PBRMetallicRoughnessMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object corresponding to the serialize function.
      * @param source
      * @param scene
      * @param rootUrl
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): PBRMetallicRoughnessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[PBRMetallicRoughnessMaterial]
  }
}

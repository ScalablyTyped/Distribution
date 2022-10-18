package typings.babylonjs

import typings.babylonjs.materialsPbrPbrBaseSimpleMaterialMod.PBRBaseSimpleMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrPbrSpecularGlossinessMaterialMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrSpecularGlossinessMaterial", "PBRSpecularGlossinessMaterial")
  @js.native
  open class PBRSpecularGlossinessMaterial protected () extends PBRBaseSimpleMaterial {
    /**
      * Instantiates a new PBRSpecularGlossinessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    
    /**
      * Specifies the diffuse color of the material.
      */
    var diffuseColor: Color3 = js.native
    
    /**
      * Specifies the diffuse texture of the material. This can also contains the opacity value in its alpha
      * channel.
      */
    var diffuseTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Specifies the glossiness of the material. This indicates "how sharp is the reflection".
      */
    var glossiness: Double = js.native
    
    /**
      * Specifies the specular color of the material. This indicates how reflective is the material (none to mirror).
      */
    var specularColor: Color3 = js.native
    
    /**
      * Specifies both the specular color RGB and the glossiness A of the material per pixels.
      */
    var specularGlossinessTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
      */
    def useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
  }
  /* static members */
  object PBRSpecularGlossinessMaterial {
    
    @JSImport("babylonjs/Materials/PBR/pbrSpecularGlossinessMaterial", "PBRSpecularGlossinessMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object corresponding to the serialize function.
      * @param source
      * @param scene
      * @param rootUrl
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): PBRSpecularGlossinessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[PBRSpecularGlossinessMaterial]
  }
}

package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
@js.native
class PBRSpecularGlossinessMaterial protected () extends PBRBaseSimpleMaterial {
  /**
    * Instantiates a new PBRSpecularGlossinessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
  /**
    * Specifies the diffuse color of the material.
    */
  var diffuseColor: Color3 = js.native
  /**
    * Specifies the diffuse texture of the material. This can also contains the opcity value in its alpha
    * channel.
    */
  var diffuseTexture: BaseTexture = js.native
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
  var specularGlossinessTexture: BaseTexture = js.native
}

/* static members */
@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
@js.native
object PBRSpecularGlossinessMaterial extends js.Object {
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): PBRSpecularGlossinessMaterial = js.native
}


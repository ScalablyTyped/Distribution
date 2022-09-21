package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRSpecularGlossinessMaterial
  extends StObject
     with PBRBaseSimpleMaterial {
  
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

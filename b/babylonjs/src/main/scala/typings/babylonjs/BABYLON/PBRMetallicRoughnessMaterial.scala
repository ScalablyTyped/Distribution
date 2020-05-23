package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBRMetallicRoughnessMaterial extends PBRBaseSimpleMaterial {
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
  var baseTexture: BaseTexture = js.native
  /**
    * Specifies the metallic scalar value of the material.
    * Can also be used to scale the metalness values of the metallic texture.
    */
  var metallic: Double = js.native
  /**
    * Texture containing both the metallic value in the B channel and the
    * roughness value in the G channel to keep better precision.
    */
  var metallicRoughnessTexture: BaseTexture = js.native
  /**
    * Specifies the roughness scalar value of the material.
    * Can also be used to scale the roughness values of the metallic texture.
    */
  var roughness: Double = js.native
}


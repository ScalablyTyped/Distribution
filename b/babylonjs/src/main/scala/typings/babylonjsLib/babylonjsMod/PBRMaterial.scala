package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Physically based material of BJS.
     *
     * This offers the main features of a standard PBR material.
     * For more information, please refer to the documentation :
     * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
     */
@JSImport("babylonjs", "PBRMaterial")
@js.native
class PBRMaterial protected ()
  extends babylonjsLib.BABYLONNs.PBRMaterial {
  /**
           * Instantiates a new PBRMaterial instance.
           *
           * @param name The material name
           * @param scene The scene the material will be use in.
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * The Physically based material of BJS.
     *
     * This offers the main features of a standard PBR material.
     * For more information, please refer to the documentation :
     * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
     */
@JSImport("babylonjs", "PBRMaterial")
@js.native
object PBRMaterial extends js.Object {
  /**
           * Defines the default value of how much AO map is occluding the analytical lights
           * (point spot...).
           */
  var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: scala.Double = js.native
  /**
           * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
           */
  val PBRMATERIAL_ALPHABLEND: scala.Double = js.native
  /**
           * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
           */
  val PBRMATERIAL_ALPHATEST: scala.Double = js.native
  /**
           * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
           * They are also discarded below the alpha cutoff threshold to improve performances.
           */
  val PBRMATERIAL_ALPHATESTANDBLEND: scala.Double = js.native
  /**
           * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
           */
  val PBRMATERIAL_OPAQUE: scala.Double = js.native
  /**
           * Parses a PBR Material from a serialized object.
           * @param source - Serialized object.
           * @param scene - BJS scene instance.
           * @param rootUrl - url for the scene object
           * @returns - PBRMaterial
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.PBRMaterial = js.native
}


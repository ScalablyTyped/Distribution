package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PBRBaseMaterial")
@js.native
abstract class PBRBaseMaterial protected ()
  extends typings.babylonjs.indexMod.PBRBaseMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "PBRBaseMaterial")
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


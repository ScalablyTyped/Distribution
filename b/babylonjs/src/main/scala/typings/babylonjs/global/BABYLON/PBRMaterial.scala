package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PBRMaterial")
@js.native
class PBRMaterial protected ()
  extends typings.babylonjs.BABYLON.PBRMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.PBRMaterial")
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
  def Parse(source: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.PBRMaterial = js.native
}


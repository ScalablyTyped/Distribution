package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Physically based simple base material of BJS.
  *
  * This enables better naming and convention enforcements on top of the pbrMaterial.
  * It is used as the base class for both the specGloss and metalRough conventions.
  */
@JSGlobal("BABYLON.PBRBaseSimpleMaterial")
@js.native
abstract class PBRBaseSimpleMaterial protected () extends PBRBaseMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: java.lang.String, scene: Scene) = this()
  /**
    * Defines the alpha limits in alpha test mode.
    */
  var alphaCutOff: scala.Double = js.native
  /**
    * If sets to true, disables all the lights affecting the material.
    */
  var disableLighting: scala.Boolean = js.native
  /**
    * Gets the current double sided mode.
    */
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    */
  var doubleSided: scala.Boolean = js.native
  /**
    * Emissivie color used to self-illuminate the model.
    */
  var emissiveColor: Color3 = js.native
  /**
    * Emissivie texture used to self-illuminate the model.
    */
  var emissiveTexture: BaseTexture = js.native
  /**
    * Environment Texture used in the material (this is use for both reflection and environment lighting).
    */
  var environmentTexture: BaseTexture = js.native
  /**
    * If sets to true, x component of normal map value will invert (x = 1.0 - x).
    */
  var invertNormalMapX: scala.Boolean = js.native
  /**
    * If sets to true, y component of normal map value will invert (y = 1.0 - y).
    */
  var invertNormalMapY: scala.Boolean = js.native
  /**
    * Stores the pre-calculated light information of a mesh in a texture.
    */
  var lightmapTexture: BaseTexture = js.native
  /**
    * Number of Simultaneous lights allowed on the material.
    */
  var maxSimultaneousLights: scala.Double = js.native
  /**
    * Normal map used in the model.
    */
  var normalTexture: BaseTexture = js.native
  /**
    * Occlusion Channel Strenght.
    */
  var occlusionStrength: scala.Double = js.native
  /**
    * Occlusion Texture of the material (adding extra occlusion effects).
    */
  var occlusionTexture: BaseTexture = js.native
  /**
    * If true, the light map contains occlusion information instead of lighting info.
    */
  var useLightmapAsShadowmap: scala.Boolean = js.native
}


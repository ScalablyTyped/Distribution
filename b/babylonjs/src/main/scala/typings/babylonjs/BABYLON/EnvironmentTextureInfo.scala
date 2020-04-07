package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentTextureInfo extends js.Object {
  /**
    * Irradiance information stored in the file.
    */
  var irradiance: js.Any
  /**
    * Specular information stored in the file.
    */
  var specular: js.Any
  /**
    * Version of the environment map
    */
  var version: Double
  /**
    * Width of image
    */
  var width: Double
}

object EnvironmentTextureInfo {
  @scala.inline
  def apply(irradiance: js.Any, specular: js.Any, version: Double, width: Double): EnvironmentTextureInfo = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnvironmentTextureInfo]
  }
}


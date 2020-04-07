package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLightmapMode extends js.Object {
  var lightmapMode: Boolean
  var needNormals: Boolean
  var needRebuild: Boolean
  var shadowEnabled: Boolean
  var specularEnabled: Boolean
}

object AnonLightmapMode {
  @scala.inline
  def apply(
    lightmapMode: Boolean,
    needNormals: Boolean,
    needRebuild: Boolean,
    shadowEnabled: Boolean,
    specularEnabled: Boolean
  ): AnonLightmapMode = {
    val __obj = js.Dynamic.literal(lightmapMode = lightmapMode.asInstanceOf[js.Any], needNormals = needNormals.asInstanceOf[js.Any], needRebuild = needRebuild.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], specularEnabled = specularEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLightmapMode]
  }
}


package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightmapMode extends js.Object {
  var lightmapMode: Boolean
  var needNormals: Boolean
  var needRebuild: Boolean
  var shadowEnabled: Boolean
  var specularEnabled: Boolean
}

object LightmapMode {
  @scala.inline
  def apply(
    lightmapMode: Boolean,
    needNormals: Boolean,
    needRebuild: Boolean,
    shadowEnabled: Boolean,
    specularEnabled: Boolean
  ): LightmapMode = {
    val __obj = js.Dynamic.literal(lightmapMode = lightmapMode.asInstanceOf[js.Any], needNormals = needNormals.asInstanceOf[js.Any], needRebuild = needRebuild.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], specularEnabled = specularEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightmapMode]
  }
}


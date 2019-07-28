package typings.cordovaDashPluginDashMediaDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a set of media capture parameters that a device supports. */
trait ConfigurationData extends js.Object {
  /** The height of the image or video in pixels. The value is zero for sound clips. */
  var height: Double
  /** The ASCII-encoded lowercase string representing the media type. */
  var `type`: String
  /** The width of the image or video in pixels. The value is zero for sound clips. */
  var width: Double
}

object ConfigurationData {
  @scala.inline
  def apply(height: Double, `type`: String, width: Double): ConfigurationData = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConfigurationData]
  }
}


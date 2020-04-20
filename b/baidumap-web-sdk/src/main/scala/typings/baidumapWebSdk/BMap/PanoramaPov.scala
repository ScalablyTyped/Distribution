package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaPov extends js.Object {
  var heading: Double
  var pitch: Double
}

object PanoramaPov {
  @scala.inline
  def apply(heading: Double, pitch: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
}


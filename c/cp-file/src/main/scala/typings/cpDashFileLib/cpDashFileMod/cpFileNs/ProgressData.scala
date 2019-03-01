package typings
package cpDashFileLib.cpDashFileMod.cpFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var dest: java.lang.String
  var percent: scala.Double
  var size: scala.Double
  var src: java.lang.String
  var written: scala.Double
}

object ProgressData {
  @scala.inline
  def apply(
    dest: java.lang.String,
    percent: scala.Double,
    size: scala.Double,
    src: java.lang.String,
    written: scala.Double
  ): ProgressData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dest")(dest)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("written")(written)
    __obj.asInstanceOf[ProgressData]
  }
}


package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRecorderManagerStopOptions extends js.Object {
  var tempFilePath: java.lang.String
}

object OnRecorderManagerStopOptions {
  @scala.inline
  def apply(tempFilePath: java.lang.String): OnRecorderManagerStopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[OnRecorderManagerStopOptions]
  }
}


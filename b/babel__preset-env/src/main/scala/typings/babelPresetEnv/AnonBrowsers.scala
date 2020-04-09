package typings.babelPresetEnv

import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowsers extends _TargetsOptions {
  var browsers: String | js.Array[String]
}

object AnonBrowsers {
  @scala.inline
  def apply(browsers: String | js.Array[String]): AnonBrowsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBrowsers]
  }
}


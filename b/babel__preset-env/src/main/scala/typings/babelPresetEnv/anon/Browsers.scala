package typings.babelPresetEnv.anon

import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browsers extends _TargetsOptions {
  var browsers: String | js.Array[String]
}

object Browsers {
  @scala.inline
  def apply(browsers: String | js.Array[String]): Browsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsers]
  }
}


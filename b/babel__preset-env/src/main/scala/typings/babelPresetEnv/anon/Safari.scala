package typings.babelPresetEnv.anon

import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Safari extends _TargetsOptions {
  var safari: String | tp
}

object Safari {
  @scala.inline
  def apply(safari: String | tp): Safari = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Safari]
  }
}


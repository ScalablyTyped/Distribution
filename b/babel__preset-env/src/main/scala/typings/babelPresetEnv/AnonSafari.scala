package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSafari extends _TargetsOptions {
  var safari: String | tp
}

object AnonSafari {
  @scala.inline
  def apply(safari: String | tp): AnonSafari = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSafari]
  }
}


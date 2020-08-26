package typings.babelPresetEnv.anon

import typings.babelPresetEnv.babelPresetEnvStrings.tp
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Safari extends _TargetsOptions {
  var safari: String | tp = js.native
}

object Safari {
  @scala.inline
  def apply(safari: String | tp): Safari = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Safari]
  }
  @scala.inline
  implicit class SafariOps[Self <: Safari] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSafari(value: String | tp): Self = this.set("safari", value.asInstanceOf[js.Any])
  }
  
}


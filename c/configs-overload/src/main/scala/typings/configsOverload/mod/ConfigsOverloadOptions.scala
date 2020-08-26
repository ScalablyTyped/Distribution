package typings.configsOverload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigsOverloadOptions extends js.Object {
  var defaultEnv: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
}

object ConfigsOverloadOptions {
  @scala.inline
  def apply(): ConfigsOverloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigsOverloadOptions]
  }
  @scala.inline
  implicit class ConfigsOverloadOptionsOps[Self <: ConfigsOverloadOptions] (val x: Self) extends AnyVal {
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
    def setDefaultEnv(value: String): Self = this.set("defaultEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEnv: Self = this.set("defaultEnv", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
  }
  
}


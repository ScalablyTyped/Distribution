package typings.consul.mod.Kv

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysOptions extends CommonOptions {
  var key: String = js.native
  var separator: js.UndefOr[String] = js.native
}

object KeysOptions {
  @scala.inline
  def apply(key: String): KeysOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeysOptions]
  }
  @scala.inline
  implicit class KeysOptionsOps[Self <: KeysOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}


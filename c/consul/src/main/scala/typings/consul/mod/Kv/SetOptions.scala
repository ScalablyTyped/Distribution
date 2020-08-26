package typings.consul.mod.Kv

import typings.consul.mod.CommonOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends CommonOptions {
  var acquire: js.UndefOr[String] = js.native
  var cas: js.UndefOr[String] = js.native
  var flags: js.UndefOr[Double] = js.native
  var key: String = js.native
  var release: js.UndefOr[String] = js.native
  var value: String | Buffer = js.native
}

object SetOptions {
  @scala.inline
  def apply(key: String, value: String | Buffer): SetOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
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
    def setValue(value: String | Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcquire(value: String): Self = this.set("acquire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquire: Self = this.set("acquire", js.undefined)
    @scala.inline
    def setCas(value: String): Self = this.set("cas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCas: Self = this.set("cas", js.undefined)
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
  }
  
}


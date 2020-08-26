package typings.cryptex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptexOpts extends js.Object {
  var cacheKey: js.UndefOr[Boolean] = js.native
  var cacheKeyTimeout: js.UndefOr[Double] = js.native
  var config: js.UndefOr[CryptexConfig] = js.native
  var env: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
}

object CryptexOpts {
  @scala.inline
  def apply(): CryptexOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptexOpts]
  }
  @scala.inline
  implicit class CryptexOptsOps[Self <: CryptexOpts] (val x: Self) extends AnyVal {
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
    def setCacheKey(value: Boolean): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setCacheKeyTimeout(value: Double): Self = this.set("cacheKeyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKeyTimeout: Self = this.set("cacheKeyTimeout", js.undefined)
    @scala.inline
    def setConfig(value: CryptexConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}


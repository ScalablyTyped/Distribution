package typings.blockingProxy.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var fork: js.UndefOr[Boolean] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var highlightDelay: js.UndefOr[String] = js.native
  var logDir: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var seleniumAddress: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setFork(value: Boolean): Self = this.set("fork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFork: Self = this.set("fork", js.undefined)
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHighlightDelay(value: String): Self = this.set("highlightDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightDelay: Self = this.set("highlightDelay", js.undefined)
    @scala.inline
    def setLogDir(value: String): Self = this.set("logDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDir: Self = this.set("logDir", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSeleniumAddress(value: String): Self = this.set("seleniumAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeleniumAddress: Self = this.set("seleniumAddress", js.undefined)
  }
  
}


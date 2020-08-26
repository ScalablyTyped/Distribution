package typings.browserResolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /**
    * the 'browser' property to use from package.json
    * @default 'browser'
    */
  var browser: js.UndefOr[String] = js.native
  /**
    * the calling filename where the require() call originated (in the source)
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * modules object with id to path mappings to consult before doing manual resolution
    * (use to provide core modules)
    */
  var modules: js.UndefOr[js.Any] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setModules(value: js.Any): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
  }
  
}


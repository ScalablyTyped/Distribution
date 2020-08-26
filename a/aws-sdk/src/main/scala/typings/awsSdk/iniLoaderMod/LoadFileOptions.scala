package typings.awsSdk.iniLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFileOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var isConfig: js.UndefOr[Boolean] = js.native
}

object LoadFileOptions {
  @scala.inline
  def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  @scala.inline
  implicit class LoadFileOptionsOps[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setIsConfig(value: Boolean): Self = this.set("isConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConfig: Self = this.set("isConfig", js.undefined)
  }
  
}


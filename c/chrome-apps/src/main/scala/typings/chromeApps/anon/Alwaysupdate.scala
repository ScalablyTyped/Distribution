package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alwaysupdate extends js.Object {
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[Boolean] = js.native
  var required_platform_version: js.UndefOr[String] = js.native
}

object Alwaysupdate {
  @scala.inline
  def apply(): Alwaysupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alwaysupdate]
  }
  @scala.inline
  implicit class AlwaysupdateOps[Self <: Alwaysupdate] (val x: Self) extends AnyVal {
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
    def setAlways_update(value: Boolean): Self = this.set("always_update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlways_update: Self = this.set("always_update", js.undefined)
    @scala.inline
    def setRequired_platform_version(value: String): Self = this.set("required_platform_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired_platform_version: Self = this.set("required_platform_version", js.undefined)
  }
  
}


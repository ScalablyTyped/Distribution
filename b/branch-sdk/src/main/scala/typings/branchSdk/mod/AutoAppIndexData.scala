package typings.branchSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoAppIndexData extends js.Object {
  var androidPackageName: js.UndefOr[String] = js.native
  var androidURL: js.UndefOr[String] = js.native
  var data: js.UndefOr[StringDictionary[CustomLinkData]] = js.native
  var iosAppId: js.UndefOr[String] = js.native
  var iosURL: js.UndefOr[String] = js.native
}

object AutoAppIndexData {
  @scala.inline
  def apply(): AutoAppIndexData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoAppIndexData]
  }
  @scala.inline
  implicit class AutoAppIndexDataOps[Self <: AutoAppIndexData] (val x: Self) extends AnyVal {
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
    def setAndroidPackageName(value: String): Self = this.set("androidPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidPackageName: Self = this.set("androidPackageName", js.undefined)
    @scala.inline
    def setAndroidURL(value: String): Self = this.set("androidURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidURL: Self = this.set("androidURL", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[CustomLinkData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIosAppId(value: String): Self = this.set("iosAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosAppId: Self = this.set("iosAppId", js.undefined)
    @scala.inline
    def setIosURL(value: String): Self = this.set("iosURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosURL: Self = this.set("iosURL", js.undefined)
  }
  
}


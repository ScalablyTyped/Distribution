package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingResult extends js.Object {
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[typings.awsSdk.ssmMod.ServiceSetting] = js.native
}

object GetServiceSettingResult {
  @scala.inline
  def apply(): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingResult]
  }
  @scala.inline
  implicit class GetServiceSettingResultOps[Self <: GetServiceSettingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServiceSetting(value: ServiceSetting): Self = this.set("ServiceSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceSetting: Self = this.set("ServiceSetting", js.undefined)
  }
  
}


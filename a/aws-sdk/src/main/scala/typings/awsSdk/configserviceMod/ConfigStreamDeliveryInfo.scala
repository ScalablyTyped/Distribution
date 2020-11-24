package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigStreamDeliveryInfo extends js.Object {
  
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Status of the last attempted delivery.  Note Providing an SNS topic on a DeliveryChannel for AWS Config is optional. If the SNS delivery is turned off, the last status will be Not_Applicable.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.native
  
  /**
    * The time from the last status change.
    */
  var lastStatusChangeTime: js.UndefOr[Date] = js.native
}
object ConfigStreamDeliveryInfo {
  
  @scala.inline
  def apply(): ConfigStreamDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigStreamDeliveryInfo]
  }
  
  @scala.inline
  implicit class ConfigStreamDeliveryInfoOps[Self <: ConfigStreamDeliveryInfo] (val x: Self) extends AnyVal {
    
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
    def setLastErrorCode(value: String): Self = this.set("lastErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastErrorCode: Self = this.set("lastErrorCode", js.undefined)
    
    @scala.inline
    def setLastErrorMessage(value: String): Self = this.set("lastErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastErrorMessage: Self = this.set("lastErrorMessage", js.undefined)
    
    @scala.inline
    def setLastStatus(value: DeliveryStatus): Self = this.set("lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatus: Self = this.set("lastStatus", js.undefined)
    
    @scala.inline
    def setLastStatusChangeTime(value: Date): Self = this.set("lastStatusChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusChangeTime: Self = this.set("lastStatusChangeTime", js.undefined)
  }
}

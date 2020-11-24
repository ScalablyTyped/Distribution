package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigExportDeliveryInfo extends js.Object {
  
  /**
    * The time of the last attempted delivery.
    */
  var lastAttemptTime: js.UndefOr[Date] = js.native
  
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Status of the last attempted delivery.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.native
  
  /**
    * The time of the last successful delivery.
    */
  var lastSuccessfulTime: js.UndefOr[Date] = js.native
  
  /**
    * The time that the next delivery occurs.
    */
  var nextDeliveryTime: js.UndefOr[Date] = js.native
}
object ConfigExportDeliveryInfo {
  
  @scala.inline
  def apply(): ConfigExportDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigExportDeliveryInfo]
  }
  
  @scala.inline
  implicit class ConfigExportDeliveryInfoOps[Self <: ConfigExportDeliveryInfo] (val x: Self) extends AnyVal {
    
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
    def setLastAttemptTime(value: Date): Self = this.set("lastAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAttemptTime: Self = this.set("lastAttemptTime", js.undefined)
    
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
    def setLastSuccessfulTime(value: Date): Self = this.set("lastSuccessfulTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulTime: Self = this.set("lastSuccessfulTime", js.undefined)
    
    @scala.inline
    def setNextDeliveryTime(value: Date): Self = this.set("nextDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDeliveryTime: Self = this.set("nextDeliveryTime", js.undefined)
  }
}

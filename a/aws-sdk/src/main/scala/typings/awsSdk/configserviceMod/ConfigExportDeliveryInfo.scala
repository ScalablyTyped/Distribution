package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigExportDeliveryInfo extends StObject {
  
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
  implicit class ConfigExportDeliveryInfoMutableBuilder[Self <: ConfigExportDeliveryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastAttemptTime(value: Date): Self = StObject.set(x, "lastAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttemptTimeUndefined: Self = StObject.set(x, "lastAttemptTime", js.undefined)
    
    @scala.inline
    def setLastErrorCode(value: String): Self = StObject.set(x, "lastErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorCodeUndefined: Self = StObject.set(x, "lastErrorCode", js.undefined)
    
    @scala.inline
    def setLastErrorMessage(value: String): Self = StObject.set(x, "lastErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorMessageUndefined: Self = StObject.set(x, "lastErrorMessage", js.undefined)
    
    @scala.inline
    def setLastStatus(value: DeliveryStatus): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    @scala.inline
    def setLastSuccessfulTime(value: Date): Self = StObject.set(x, "lastSuccessfulTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulTimeUndefined: Self = StObject.set(x, "lastSuccessfulTime", js.undefined)
    
    @scala.inline
    def setNextDeliveryTime(value: Date): Self = StObject.set(x, "nextDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDeliveryTimeUndefined: Self = StObject.set(x, "nextDeliveryTime", js.undefined)
  }
}

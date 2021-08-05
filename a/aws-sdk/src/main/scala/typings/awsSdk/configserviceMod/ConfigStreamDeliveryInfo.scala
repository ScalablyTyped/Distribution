package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigStreamDeliveryInfo extends StObject {
  
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the last attempted delivery.  Note Providing an SNS topic on a DeliveryChannel for AWS Config is optional. If the SNS delivery is turned off, the last status will be Not_Applicable.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
  
  /**
    * The time from the last status change.
    */
  var lastStatusChangeTime: js.UndefOr[Date] = js.undefined
}
object ConfigStreamDeliveryInfo {
  
  inline def apply(): ConfigStreamDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigStreamDeliveryInfo]
  }
  
  extension [Self <: ConfigStreamDeliveryInfo](x: Self) {
    
    inline def setLastErrorCode(value: String): Self = StObject.set(x, "lastErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLastErrorCodeUndefined: Self = StObject.set(x, "lastErrorCode", js.undefined)
    
    inline def setLastErrorMessage(value: String): Self = StObject.set(x, "lastErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setLastErrorMessageUndefined: Self = StObject.set(x, "lastErrorMessage", js.undefined)
    
    inline def setLastStatus(value: DeliveryStatus): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTime(value: Date): Self = StObject.set(x, "lastStatusChangeTime", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTimeUndefined: Self = StObject.set(x, "lastStatusChangeTime", js.undefined)
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
  }
}

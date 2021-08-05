package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlacklistReportsRequest extends StObject {
  
  /**
    * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
    */
  var BlacklistItemNames: typings.awsSdk.pinpointemailMod.BlacklistItemNames
}
object GetBlacklistReportsRequest {
  
  inline def apply(BlacklistItemNames: BlacklistItemNames): GetBlacklistReportsRequest = {
    val __obj = js.Dynamic.literal(BlacklistItemNames = BlacklistItemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsRequest]
  }
  
  extension [Self <: GetBlacklistReportsRequest](x: Self) {
    
    inline def setBlacklistItemNames(value: BlacklistItemNames): Self = StObject.set(x, "BlacklistItemNames", value.asInstanceOf[js.Any])
    
    inline def setBlacklistItemNamesVarargs(value: BlacklistItemName*): Self = StObject.set(x, "BlacklistItemNames", js.Array(value :_*))
  }
}

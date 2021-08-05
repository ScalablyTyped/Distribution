package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSendingEnabledResponse extends StObject {
  
  /**
    * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesMod.Enabled] = js.undefined
}
object GetAccountSendingEnabledResponse {
  
  inline def apply(): GetAccountSendingEnabledResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSendingEnabledResponse]
  }
  
  extension [Self <: GetAccountSendingEnabledResponse](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}

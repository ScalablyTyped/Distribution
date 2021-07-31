package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlacklistReportsRequest extends StObject {
  
  /**
    * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated IP addresses that you use to send email using Amazon SES or Amazon Pinpoint.
    */
  var BlacklistItemNames: typings.awsSdk.sesv2Mod.BlacklistItemNames
}
object GetBlacklistReportsRequest {
  
  @scala.inline
  def apply(BlacklistItemNames: BlacklistItemNames): GetBlacklistReportsRequest = {
    val __obj = js.Dynamic.literal(BlacklistItemNames = BlacklistItemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsRequest]
  }
  
  @scala.inline
  implicit class GetBlacklistReportsRequestMutableBuilder[Self <: GetBlacklistReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlacklistItemNames(value: BlacklistItemNames): Self = StObject.set(x, "BlacklistItemNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistItemNamesVarargs(value: BlacklistItemName*): Self = StObject.set(x, "BlacklistItemNames", js.Array(value :_*))
  }
}

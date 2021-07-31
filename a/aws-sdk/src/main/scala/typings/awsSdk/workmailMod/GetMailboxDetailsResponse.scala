package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMailboxDetailsResponse extends StObject {
  
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[typings.awsSdk.workmailMod.MailboxQuota] = js.undefined
  
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[typings.awsSdk.workmailMod.MailboxSize] = js.undefined
}
object GetMailboxDetailsResponse {
  
  @scala.inline
  def apply(): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
  
  @scala.inline
  implicit class GetMailboxDetailsResponseMutableBuilder[Self <: GetMailboxDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailboxQuota(value: MailboxQuota): Self = StObject.set(x, "MailboxQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailboxQuotaUndefined: Self = StObject.set(x, "MailboxQuota", js.undefined)
    
    @scala.inline
    def setMailboxSize(value: MailboxSize): Self = StObject.set(x, "MailboxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailboxSizeUndefined: Self = StObject.set(x, "MailboxSize", js.undefined)
  }
}

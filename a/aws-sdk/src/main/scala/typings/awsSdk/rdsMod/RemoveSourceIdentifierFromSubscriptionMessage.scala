package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
  
  /**
    *  The source identifier to be removed from the subscription, such as the DB instance identifier for a DB instance or the name of a security group. 
    */
  var SourceIdentifier: String = js.native
  
  /**
    * The name of the RDS event notification subscription you want to remove a source identifier from.
    */
  var SubscriptionName: String = js.native
}
object RemoveSourceIdentifierFromSubscriptionMessage {
  
  @scala.inline
  def apply(SourceIdentifier: String, SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
  }
  
  @scala.inline
  implicit class RemoveSourceIdentifierFromSubscriptionMessageOps[Self <: RemoveSourceIdentifierFromSubscriptionMessage] (val x: Self) extends AnyVal {
    
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
    def setSourceIdentifier(value: String): Self = this.set("SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
  }
}

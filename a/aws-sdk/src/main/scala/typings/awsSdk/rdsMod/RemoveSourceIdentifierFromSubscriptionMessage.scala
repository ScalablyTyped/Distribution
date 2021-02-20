package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSourceIdentifierFromSubscriptionMessage extends StObject {
  
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
  implicit class RemoveSourceIdentifierFromSubscriptionMessageMutableBuilder[Self <: RemoveSourceIdentifierFromSubscriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}

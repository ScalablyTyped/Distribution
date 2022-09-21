package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveSourceIdentifierFromSubscriptionMessage extends StObject {
  
  /**
    *  The source identifier to be removed from the subscription, such as the instance identifier for an instance, or the name of a security group. 
    */
  var SourceIdentifier: String
  
  /**
    * The name of the Amazon DocumentDB event notification subscription that you want to remove a source identifier from.
    */
  var SubscriptionName: String
}
object RemoveSourceIdentifierFromSubscriptionMessage {
  
  inline def apply(SourceIdentifier: String, SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
  }
  
  extension [Self <: RemoveSourceIdentifierFromSubscriptionMessage](x: Self) {
    
    inline def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}

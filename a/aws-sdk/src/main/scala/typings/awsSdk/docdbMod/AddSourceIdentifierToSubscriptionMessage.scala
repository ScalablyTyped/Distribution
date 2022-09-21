package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSourceIdentifierToSubscriptionMessage extends StObject {
  
  /**
    * The identifier of the event source to be added:   If the source type is an instance, a DBInstanceIdentifier must be provided.   If the source type is a security group, a DBSecurityGroupName must be provided.   If the source type is a parameter group, a DBParameterGroupName must be provided.   If the source type is a snapshot, a DBSnapshotIdentifier must be provided.  
    */
  var SourceIdentifier: String
  
  /**
    * The name of the Amazon DocumentDB event notification subscription that you want to add a source identifier to.
    */
  var SubscriptionName: String
}
object AddSourceIdentifierToSubscriptionMessage {
  
  inline def apply(SourceIdentifier: String, SubscriptionName: String): AddSourceIdentifierToSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
  }
  
  extension [Self <: AddSourceIdentifierToSubscriptionMessage](x: Self) {
    
    inline def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}

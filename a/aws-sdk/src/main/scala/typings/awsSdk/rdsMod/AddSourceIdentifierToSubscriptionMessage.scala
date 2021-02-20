package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSourceIdentifierToSubscriptionMessage extends StObject {
  
  /**
    * The identifier of the event source to be added. Constraints:   If the source type is a DB instance, a DBInstanceIdentifier value must be supplied.   If the source type is a DB cluster, a DBClusterIdentifier value must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName value must be supplied.   If the source type is a DB security group, a DBSecurityGroupName value must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier value must be supplied.   If the source type is a DB cluster snapshot, a DBClusterSnapshotIdentifier value must be supplied.  
    */
  var SourceIdentifier: String = js.native
  
  /**
    * The name of the RDS event notification subscription you want to add a source identifier to.
    */
  var SubscriptionName: String = js.native
}
object AddSourceIdentifierToSubscriptionMessage {
  
  @scala.inline
  def apply(SourceIdentifier: String, SubscriptionName: String): AddSourceIdentifierToSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
  }
  
  @scala.inline
  implicit class AddSourceIdentifierToSubscriptionMessageMutableBuilder[Self <: AddSourceIdentifierToSubscriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
  }
}

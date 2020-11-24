package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
  
  /**
    * The identifier of the event source to be added. Constraints:   If the source type is a DB instance, then a DBInstanceIdentifier must be supplied.   If the source type is a DB security group, a DBSecurityGroupName must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier must be supplied.  
    */
  var SourceIdentifier: String = js.native
  
  /**
    * The name of the event notification subscription you want to add a source identifier to.
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
  implicit class AddSourceIdentifierToSubscriptionMessageOps[Self <: AddSourceIdentifierToSubscriptionMessage] (val x: Self) extends AnyVal {
    
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

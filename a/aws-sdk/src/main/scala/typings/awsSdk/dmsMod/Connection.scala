package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  /**
    * The ARN string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The error message when the connection last failed.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The connection status. This parameter can return one of the following values:    "successful"     "testing"     "failed"     "deleting"   
    */
  var Status: js.UndefOr[String] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
    
    @scala.inline
    def setEndpointIdentifier(value: String): Self = this.set("EndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointIdentifier: Self = this.set("EndpointIdentifier", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = this.set("LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFailureMessage: Self = this.set("LastFailureMessage", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationInstanceIdentifier(value: String): Self = this.set("ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceIdentifier: Self = this.set("ReplicationInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}

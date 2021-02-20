package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
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
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    @scala.inline
    def setEndpointIdentifier(value: String): Self = StObject.set(x, "EndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointIdentifierUndefined: Self = StObject.set(x, "EndpointIdentifier", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationInstanceIdentifier(value: String): Self = StObject.set(x, "ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceIdentifierUndefined: Self = StObject.set(x, "ReplicationInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

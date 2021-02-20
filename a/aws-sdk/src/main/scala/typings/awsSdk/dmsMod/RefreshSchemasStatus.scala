package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshSchemasStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  
  /**
    * The last failure message for the schema.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  
  /**
    * The date the schema was last refreshed.
    */
  var LastRefreshDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.native
}
object RefreshSchemasStatus {
  
  @scala.inline
  def apply(): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
  
  @scala.inline
  implicit class RefreshSchemasStatusMutableBuilder[Self <: RefreshSchemasStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    @scala.inline
    def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    @scala.inline
    def setLastRefreshDate(value: TStamp): Self = StObject.set(x, "LastRefreshDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshDateUndefined: Self = StObject.set(x, "LastRefreshDate", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setStatus(value: RefreshSchemasStatusTypeValue): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

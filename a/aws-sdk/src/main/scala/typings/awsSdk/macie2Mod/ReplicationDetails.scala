package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationDetails extends StObject {
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to any destination.
    */
  var replicated: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to an AWS account that isn't part of the same Amazon Macie organization.
    */
  var replicatedExternally: js.UndefOr[boolean] = js.native
  
  /**
    * An array of AWS account IDs, one for each AWS account that the bucket is configured to replicate one or more objects to.
    */
  var replicationAccounts: js.UndefOr[listOfString] = js.native
}
object ReplicationDetails {
  
  @scala.inline
  def apply(): ReplicationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationDetails]
  }
  
  @scala.inline
  implicit class ReplicationDetailsMutableBuilder[Self <: ReplicationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicated(value: boolean): Self = StObject.set(x, "replicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicatedExternally(value: boolean): Self = StObject.set(x, "replicatedExternally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicatedExternallyUndefined: Self = StObject.set(x, "replicatedExternally", js.undefined)
    
    @scala.inline
    def setReplicatedUndefined: Self = StObject.set(x, "replicated", js.undefined)
    
    @scala.inline
    def setReplicationAccounts(value: listOfString): Self = StObject.set(x, "replicationAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationAccountsUndefined: Self = StObject.set(x, "replicationAccounts", js.undefined)
    
    @scala.inline
    def setReplicationAccountsVarargs(value: string*): Self = StObject.set(x, "replicationAccounts", js.Array(value :_*))
  }
}

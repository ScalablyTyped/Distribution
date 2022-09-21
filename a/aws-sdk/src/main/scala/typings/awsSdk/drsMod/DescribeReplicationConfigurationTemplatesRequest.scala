package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationConfigurationTemplatesRequest extends StObject {
  
  /**
    * Maximum number of Replication Configuration Templates to retrieve.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * The token of the next Replication Configuration Template to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The IDs of the Replication Configuration Templates to retrieve. An empty list means all Replication Configuration Templates.
    */
  var replicationConfigurationTemplateIDs: js.UndefOr[ReplicationConfigurationTemplateIDs] = js.undefined
}
object DescribeReplicationConfigurationTemplatesRequest {
  
  inline def apply(): DescribeReplicationConfigurationTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationConfigurationTemplatesRequest]
  }
  
  extension [Self <: DescribeReplicationConfigurationTemplatesRequest](x: Self) {
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplicationConfigurationTemplateIDs(value: ReplicationConfigurationTemplateIDs): Self = StObject.set(x, "replicationConfigurationTemplateIDs", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationTemplateIDsUndefined: Self = StObject.set(x, "replicationConfigurationTemplateIDs", js.undefined)
    
    inline def setReplicationConfigurationTemplateIDsVarargs(value: ReplicationConfigurationTemplateID*): Self = StObject.set(x, "replicationConfigurationTemplateIDs", js.Array(value*))
  }
}

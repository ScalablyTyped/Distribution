package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScramSecretsRequest extends StObject {
  
  /**
    * 
    The arn of the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The maxResults of the query.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.undefined
  
  /**
    * 
    The nextToken of the query.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListScramSecretsRequest {
  
  @scala.inline
  def apply(ClusterArn: string): ListScramSecretsRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScramSecretsRequest]
  }
  
  @scala.inline
  implicit class ListScramSecretsRequestMutableBuilder[Self <: ListScramSecretsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

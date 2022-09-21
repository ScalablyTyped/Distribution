package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsMetadataRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetOpsMetadataMaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an OpsMetadata Object to view.
    */
  var OpsMetadataArn: typings.awsSdk.ssmMod.OpsMetadataArn
}
object GetOpsMetadataRequest {
  
  inline def apply(OpsMetadataArn: OpsMetadataArn): GetOpsMetadataRequest = {
    val __obj = js.Dynamic.literal(OpsMetadataArn = OpsMetadataArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsMetadataRequest]
  }
  
  extension [Self <: GetOpsMetadataRequest](x: Self) {
    
    inline def setMaxResults(value: GetOpsMetadataMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
  }
}

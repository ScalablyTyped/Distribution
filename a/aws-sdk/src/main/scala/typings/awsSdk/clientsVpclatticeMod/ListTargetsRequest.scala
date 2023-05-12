package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the target group.
    */
  var targetGroupIdentifier: TargetGroupIdentifier
  
  /**
    * The targets to list.
    */
  var targets: js.UndefOr[ListTargetsRequestTargetsList] = js.undefined
}
object ListTargetsRequest {
  
  inline def apply(targetGroupIdentifier: TargetGroupIdentifier): ListTargetsRequest = {
    val __obj = js.Dynamic.literal(targetGroupIdentifier = targetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTargetGroupIdentifier(value: TargetGroupIdentifier): Self = StObject.set(x, "targetGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: ListTargetsRequestTargetsList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}

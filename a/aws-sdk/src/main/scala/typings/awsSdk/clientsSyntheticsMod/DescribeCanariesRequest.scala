package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCanariesRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many canaries are returned each time you use the DescribeCanaries operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxCanaryResults] = js.undefined
  
  /**
    * Use this parameter to return only canaries that match the names that you specify here. You can specify as many as five canary names. If you specify this parameter, the operation is successful only if you have authorization to view all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the request fails with a 403 response. You are required to use this parameter if you are logged on to a user or role that has an IAM policy that restricts which canaries that you are allowed to view. For more information, see  Limiting a user to viewing specific canaries.
    */
  var Names: js.UndefOr[DescribeCanariesNameFilter] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeCanariesRequest {
  
  inline def apply(): DescribeCanariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesRequest]
  }
  
  extension [Self <: DescribeCanariesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxCanaryResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNames(value: DescribeCanariesNameFilter): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: CanaryName*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

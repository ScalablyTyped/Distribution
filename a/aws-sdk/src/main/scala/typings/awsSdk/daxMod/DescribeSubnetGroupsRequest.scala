package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubnetGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the subnet group.
    */
  var SubnetGroupNames: js.UndefOr[SubnetGroupNameList] = js.native
}
object DescribeSubnetGroupsRequest {
  
  @scala.inline
  def apply(): DescribeSubnetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeSubnetGroupsRequestMutableBuilder[Self <: DescribeSubnetGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubnetGroupNames(value: SubnetGroupNameList): Self = StObject.set(x, "SubnetGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupNamesUndefined: Self = StObject.set(x, "SubnetGroupNames", js.undefined)
    
    @scala.inline
    def setSubnetGroupNamesVarargs(value: String*): Self = StObject.set(x, "SubnetGroupNames", js.Array(value :_*))
  }
}

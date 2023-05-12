package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceInformationRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of managed nodes. You can filter based on tags applied to your managed nodes. Use this Filters data type instead of InstanceInformationFilterList, which is deprecated.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.undefined
  
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the Filters data type. Filters enables you to return node information by filtering based on tags applied to managed nodes.  Attempting to use InstanceInformationFilterList and Filters leads to an exception error.  
    */
  var InstanceInformationFilterList: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.InstanceInformationFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
}
object DescribeInstanceInformationRequest {
  
  inline def apply(): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceInformationRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: InstanceInformationStringFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: InstanceInformationStringFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setInstanceInformationFilterList(value: InstanceInformationFilterList): Self = StObject.set(x, "InstanceInformationFilterList", value.asInstanceOf[js.Any])
    
    inline def setInstanceInformationFilterListUndefined: Self = StObject.set(x, "InstanceInformationFilterList", js.undefined)
    
    inline def setInstanceInformationFilterListVarargs(value: InstanceInformationFilter*): Self = StObject.set(x, "InstanceInformationFilterList", js.Array(value*))
    
    inline def setMaxResults(value: MaxResultsEC2Compatible): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

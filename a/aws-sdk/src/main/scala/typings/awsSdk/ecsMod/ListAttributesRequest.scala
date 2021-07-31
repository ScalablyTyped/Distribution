package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttributesRequest extends StObject {
  
  /**
    * The name of the attribute with which to filter the results. 
    */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the attribute with which to filter results. You must also specify an attribute name to use this parameter.
    */
  var attributeValue: js.UndefOr[String] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of cluster results returned by ListAttributes in paginated output. When this parameter is used, ListAttributes only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListAttributes request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListAttributes returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The nextToken value returned from a ListAttributes request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the target with which to list attributes.
    */
  var targetType: TargetType
}
object ListAttributesRequest {
  
  @scala.inline
  def apply(targetType: TargetType): ListAttributesRequest = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttributesRequest]
  }
  
  @scala.inline
  implicit class ListAttributesRequestMutableBuilder[Self <: ListAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}

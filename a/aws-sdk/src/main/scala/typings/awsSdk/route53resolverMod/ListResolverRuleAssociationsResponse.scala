package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverRuleAssociationsResponse extends StObject {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.undefined
  
  /**
    * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
  
  /**
    * The associations that were created between Resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverRuleAssociations: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociations] = js.undefined
}
object ListResolverRuleAssociationsResponse {
  
  inline def apply(): ListResolverRuleAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
  }
  
  extension [Self <: ListResolverRuleAssociationsResponse](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverRuleAssociations(value: ResolverRuleAssociations): Self = StObject.set(x, "ResolverRuleAssociations", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleAssociationsUndefined: Self = StObject.set(x, "ResolverRuleAssociations", js.undefined)
    
    inline def setResolverRuleAssociationsVarargs(value: ResolverRuleAssociation*): Self = StObject.set(x, "ResolverRuleAssociations", js.Array(value :_*))
  }
}

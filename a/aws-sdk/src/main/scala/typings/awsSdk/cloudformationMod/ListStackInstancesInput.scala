package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackInstancesInput extends StObject {
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated administrator in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.cloudformationMod.CallAs] = js.undefined
  
  /**
    * The status that stack instances are filtered by.
    */
  var Filters: js.UndefOr[StackInstanceFilters] = js.undefined
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.undefined
  
  /**
    * If the previous request didn't return all the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The name of the Amazon Web Services account that you want to list stack instances for.
    */
  var StackInstanceAccount: js.UndefOr[Account] = js.undefined
  
  /**
    * The name of the Region where you want to list stack instances.
    */
  var StackInstanceRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * The name or unique ID of the stack set that you want to list stack instances for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName
}
object ListStackInstancesInput {
  
  inline def apply(StackSetName: StackSetName): ListStackInstancesInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesInput]
  }
  
  extension [Self <: ListStackInstancesInput](x: Self) {
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setFilters(value: StackInstanceFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: StackInstanceFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackInstanceAccount(value: Account): Self = StObject.set(x, "StackInstanceAccount", value.asInstanceOf[js.Any])
    
    inline def setStackInstanceAccountUndefined: Self = StObject.set(x, "StackInstanceAccount", js.undefined)
    
    inline def setStackInstanceRegion(value: Region): Self = StObject.set(x, "StackInstanceRegion", value.asInstanceOf[js.Any])
    
    inline def setStackInstanceRegionUndefined: Self = StObject.set(x, "StackInstanceRegion", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}

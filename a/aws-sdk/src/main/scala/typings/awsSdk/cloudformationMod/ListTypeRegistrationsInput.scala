package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypeRegistrationsInput extends StObject {
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The current status of the type registration request. The default is IN_PROGRESS.
    */
  var RegistrationStatusFilter: js.UndefOr[RegistrationStatus] = js.native
  
  /**
    * The kind of type. Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}
object ListTypeRegistrationsInput {
  
  @scala.inline
  def apply(): ListTypeRegistrationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeRegistrationsInput]
  }
  
  @scala.inline
  implicit class ListTypeRegistrationsInputMutableBuilder[Self <: ListTypeRegistrationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistrationStatusFilter(value: RegistrationStatus): Self = StObject.set(x, "RegistrationStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationStatusFilterUndefined: Self = StObject.set(x, "RegistrationStatusFilter", js.undefined)
    
    @scala.inline
    def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    @scala.inline
    def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

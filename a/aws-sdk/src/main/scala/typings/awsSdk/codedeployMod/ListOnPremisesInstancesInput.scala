package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOnPremisesInstancesInput extends StObject {
  
  /**
    * An identifier returned from the previous list on-premises instances call. It can be used to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The registration status of the on-premises instances:    Deregistered: Include deregistered on-premises instances in the resulting list.    Registered: Include registered on-premises instances in the resulting list.  
    */
  var registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
  
  /**
    * The on-premises instance tags that are used to restrict the on-premises instance names returned.
    */
  var tagFilters: js.UndefOr[TagFilterList] = js.undefined
}
object ListOnPremisesInstancesInput {
  
  @scala.inline
  def apply(): ListOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOnPremisesInstancesInput]
  }
  
  @scala.inline
  implicit class ListOnPremisesInstancesInputMutableBuilder[Self <: ListOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationStatusUndefined: Self = StObject.set(x, "registrationStatus", js.undefined)
    
    @scala.inline
    def setTagFilters(value: TagFilterList): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
  }
}

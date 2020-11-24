package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOnPremisesInstancesInput extends js.Object {
  
  /**
    * An identifier returned from the previous list on-premises instances call. It can be used to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The registration status of the on-premises instances:    Deregistered: Include deregistered on-premises instances in the resulting list.    Registered: Include registered on-premises instances in the resulting list.  
    */
  var registrationStatus: js.UndefOr[RegistrationStatus] = js.native
  
  /**
    * The on-premises instance tags that are used to restrict the on-premises instance names returned.
    */
  var tagFilters: js.UndefOr[TagFilterList] = js.native
}
object ListOnPremisesInstancesInput {
  
  @scala.inline
  def apply(): ListOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOnPremisesInstancesInput]
  }
  
  @scala.inline
  implicit class ListOnPremisesInstancesInputOps[Self <: ListOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRegistrationStatus(value: RegistrationStatus): Self = this.set("registrationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationStatus: Self = this.set("registrationStatus", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = this.set("tagFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagFilters(value: TagFilterList): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
  }
}

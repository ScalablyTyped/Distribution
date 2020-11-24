package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStackInstancesInput extends js.Object {
  
  /**
    * The status that stack instances are filtered by.
    */
  var Filters: js.UndefOr[StackInstanceFilters] = js.native
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  
  /**
    * If the previous request didn't return all of the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The name of the AWS account that you want to list stack instances for.
    */
  var StackInstanceAccount: js.UndefOr[Account] = js.native
  
  /**
    * The name of the Region where you want to list stack instances. 
    */
  var StackInstanceRegion: js.UndefOr[Region] = js.native
  
  /**
    * The name or unique ID of the stack set that you want to list stack instances for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object ListStackInstancesInput {
  
  @scala.inline
  def apply(StackSetName: StackSetName): ListStackInstancesInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesInput]
  }
  
  @scala.inline
  implicit class ListStackInstancesInputOps[Self <: ListStackInstancesInput] (val x: Self) extends AnyVal {
    
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
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: StackInstanceFilter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: StackInstanceFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStackInstanceAccount(value: Account): Self = this.set("StackInstanceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackInstanceAccount: Self = this.set("StackInstanceAccount", js.undefined)
    
    @scala.inline
    def setStackInstanceRegion(value: Region): Self = this.set("StackInstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackInstanceRegion: Self = this.set("StackInstanceRegion", js.undefined)
  }
}

package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackResourceDriftsInput extends js.Object {
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[BoxedMaxResults] = js.native
  
  /**
    * A string that identifies the next page of stack resource drift results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The name of the stack for which you want drift information.
    */
  var StackName: StackNameOrId = js.native
  
  /**
    * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatusFilters: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceDriftStatusFilters] = js.native
}
object DescribeStackResourceDriftsInput {
  
  @scala.inline
  def apply(StackName: StackNameOrId): DescribeStackResourceDriftsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsInput]
  }
  
  @scala.inline
  implicit class DescribeStackResourceDriftsInputOps[Self <: DescribeStackResourceDriftsInput] (val x: Self) extends AnyVal {
    
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
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: BoxedMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStackResourceDriftStatusFiltersVarargs(value: StackResourceDriftStatus*): Self = this.set("StackResourceDriftStatusFilters", js.Array(value :_*))
    
    @scala.inline
    def setStackResourceDriftStatusFilters(value: StackResourceDriftStatusFilters): Self = this.set("StackResourceDriftStatusFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackResourceDriftStatusFilters: Self = this.set("StackResourceDriftStatusFilters", js.undefined)
  }
}

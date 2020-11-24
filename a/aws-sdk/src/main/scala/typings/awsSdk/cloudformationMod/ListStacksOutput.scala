package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStacksOutput extends js.Object {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of StackSummary structures containing information about the specified stacks.
    */
  var StackSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.StackSummaries] = js.native
}
object ListStacksOutput {
  
  @scala.inline
  def apply(): ListStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksOutput]
  }
  
  @scala.inline
  implicit class ListStacksOutputOps[Self <: ListStacksOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStackSummariesVarargs(value: StackSummary*): Self = this.set("StackSummaries", js.Array(value :_*))
    
    @scala.inline
    def setStackSummaries(value: StackSummaries): Self = this.set("StackSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSummaries: Self = this.set("StackSummaries", js.undefined)
  }
}

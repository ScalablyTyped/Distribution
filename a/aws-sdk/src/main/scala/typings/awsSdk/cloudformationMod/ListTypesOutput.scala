package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypesOutput extends js.Object {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of TypeSummary structures that contain information about the specified types.
    */
  var TypeSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.TypeSummaries] = js.native
}
object ListTypesOutput {
  
  @scala.inline
  def apply(): ListTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypesOutput]
  }
  
  @scala.inline
  implicit class ListTypesOutputOps[Self <: ListTypesOutput] (val x: Self) extends AnyVal {
    
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
    def setTypeSummariesVarargs(value: TypeSummary*): Self = this.set("TypeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTypeSummaries(value: TypeSummaries): Self = this.set("TypeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeSummaries: Self = this.set("TypeSummaries", js.undefined)
  }
}

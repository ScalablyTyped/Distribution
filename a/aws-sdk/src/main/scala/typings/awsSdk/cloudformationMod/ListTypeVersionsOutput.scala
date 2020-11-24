package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypeVersionsOutput extends js.Object {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of TypeVersionSummary structures that contain information about the specified type's versions.
    */
  var TypeVersionSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.TypeVersionSummaries] = js.native
}
object ListTypeVersionsOutput {
  
  @scala.inline
  def apply(): ListTypeVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsOutput]
  }
  
  @scala.inline
  implicit class ListTypeVersionsOutputOps[Self <: ListTypeVersionsOutput] (val x: Self) extends AnyVal {
    
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
    def setTypeVersionSummariesVarargs(value: TypeVersionSummary*): Self = this.set("TypeVersionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTypeVersionSummaries(value: TypeVersionSummaries): Self = this.set("TypeVersionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeVersionSummaries: Self = this.set("TypeVersionSummaries", js.undefined)
  }
}

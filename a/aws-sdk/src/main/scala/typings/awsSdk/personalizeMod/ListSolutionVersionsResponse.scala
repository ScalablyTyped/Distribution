package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSolutionVersionsResponse extends js.Object {
  
  /**
    * A token for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of solution versions describing the version properties.
    */
  var solutionVersions: js.UndefOr[SolutionVersions] = js.native
}
object ListSolutionVersionsResponse {
  
  @scala.inline
  def apply(): ListSolutionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionVersionsResponse]
  }
  
  @scala.inline
  implicit class ListSolutionVersionsResponseOps[Self <: ListSolutionVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setSolutionVersionsVarargs(value: SolutionVersionSummary*): Self = this.set("solutionVersions", js.Array(value :_*))
    
    @scala.inline
    def setSolutionVersions(value: SolutionVersions): Self = this.set("solutionVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionVersions: Self = this.set("solutionVersions", js.undefined)
  }
}

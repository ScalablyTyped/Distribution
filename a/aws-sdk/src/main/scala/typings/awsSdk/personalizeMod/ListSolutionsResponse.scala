package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSolutionsResponse extends js.Object {
  
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.native
}
object ListSolutionsResponse {
  
  @scala.inline
  def apply(): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionsResponse]
  }
  
  @scala.inline
  implicit class ListSolutionsResponseOps[Self <: ListSolutionsResponse] (val x: Self) extends AnyVal {
    
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
    def setSolutionsVarargs(value: SolutionSummary*): Self = this.set("solutions", js.Array(value :_*))
    
    @scala.inline
    def setSolutions(value: Solutions): Self = this.set("solutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutions: Self = this.set("solutions", js.undefined)
  }
}

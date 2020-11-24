package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkforcesResponse extends js.Object {
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * A list containing information about your workforce.
    */
  var Workforces: typings.awsSdk.sagemakerMod.Workforces = js.native
}
object ListWorkforcesResponse {
  
  @scala.inline
  def apply(Workforces: Workforces): ListWorkforcesResponse = {
    val __obj = js.Dynamic.literal(Workforces = Workforces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkforcesResponse]
  }
  
  @scala.inline
  implicit class ListWorkforcesResponseOps[Self <: ListWorkforcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkforcesVarargs(value: Workforce*): Self = this.set("Workforces", js.Array(value :_*))
    
    @scala.inline
    def setWorkforces(value: Workforces): Self = this.set("Workforces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

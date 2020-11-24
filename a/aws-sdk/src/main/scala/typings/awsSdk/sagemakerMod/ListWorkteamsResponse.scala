package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkteamsResponse extends js.Object {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var Workteams: typings.awsSdk.sagemakerMod.Workteams = js.native
}
object ListWorkteamsResponse {
  
  @scala.inline
  def apply(Workteams: Workteams): ListWorkteamsResponse = {
    val __obj = js.Dynamic.literal(Workteams = Workteams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkteamsResponse]
  }
  
  @scala.inline
  implicit class ListWorkteamsResponseOps[Self <: ListWorkteamsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkteamsVarargs(value: Workteam*): Self = this.set("Workteams", js.Array(value :_*))
    
    @scala.inline
    def setWorkteams(value: Workteams): Self = this.set("Workteams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

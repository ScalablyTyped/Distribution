package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscribedWorkteamsResponse extends js.Object {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var SubscribedWorkteams: typings.awsSdk.sagemakerMod.SubscribedWorkteams = js.native
}
object ListSubscribedWorkteamsResponse {
  
  @scala.inline
  def apply(SubscribedWorkteams: SubscribedWorkteams): ListSubscribedWorkteamsResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteams = SubscribedWorkteams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscribedWorkteamsResponse]
  }
  
  @scala.inline
  implicit class ListSubscribedWorkteamsResponseOps[Self <: ListSubscribedWorkteamsResponse] (val x: Self) extends AnyVal {
    
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
    def setSubscribedWorkteamsVarargs(value: SubscribedWorkteam*): Self = this.set("SubscribedWorkteams", js.Array(value :_*))
    
    @scala.inline
    def setSubscribedWorkteams(value: SubscribedWorkteams): Self = this.set("SubscribedWorkteams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

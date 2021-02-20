package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscribedWorkteamsResponse extends StObject {
  
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
  implicit class ListSubscribedWorkteamsResponseMutableBuilder[Self <: ListSubscribedWorkteamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubscribedWorkteams(value: SubscribedWorkteams): Self = StObject.set(x, "SubscribedWorkteams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedWorkteamsVarargs(value: SubscribedWorkteam*): Self = StObject.set(x, "SubscribedWorkteams", js.Array(value :_*))
  }
}

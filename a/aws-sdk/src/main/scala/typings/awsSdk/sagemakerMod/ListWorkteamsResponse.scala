package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkteamsResponse extends StObject {
  
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
  implicit class ListWorkteamsResponseMutableBuilder[Self <: ListWorkteamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkteams(value: Workteams): Self = StObject.set(x, "Workteams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamsVarargs(value: Workteam*): Self = StObject.set(x, "Workteams", js.Array(value :_*))
  }
}

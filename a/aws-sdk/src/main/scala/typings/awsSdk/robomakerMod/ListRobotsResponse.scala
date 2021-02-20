package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRobotsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListRobots again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of robots that meet the criteria of the request.
    */
  var robots: js.UndefOr[Robots] = js.native
}
object ListRobotsResponse {
  
  @scala.inline
  def apply(): ListRobotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRobotsResponse]
  }
  
  @scala.inline
  implicit class ListRobotsResponseMutableBuilder[Self <: ListRobotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRobots(value: Robots): Self = StObject.set(x, "robots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotsUndefined: Self = StObject.set(x, "robots", js.undefined)
    
    @scala.inline
    def setRobotsVarargs(value: Robot*): Self = StObject.set(x, "robots", js.Array(value :_*))
  }
}

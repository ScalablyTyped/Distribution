package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlayerSessionsOutput extends StObject {
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A collection of objects containing properties for each player session that matches the request.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}
object DescribePlayerSessionsOutput {
  
  @scala.inline
  def apply(): DescribePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsOutput]
  }
  
  @scala.inline
  implicit class DescribePlayerSessionsOutputMutableBuilder[Self <: DescribePlayerSessionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlayerSessions(value: PlayerSessionList): Self = StObject.set(x, "PlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionsUndefined: Self = StObject.set(x, "PlayerSessions", js.undefined)
    
    @scala.inline
    def setPlayerSessionsVarargs(value: PlayerSession*): Self = StObject.set(x, "PlayerSessions", js.Array(value :_*))
  }
}

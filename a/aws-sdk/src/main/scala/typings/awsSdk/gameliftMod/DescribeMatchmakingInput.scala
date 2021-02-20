package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMatchmakingInput extends StObject {
  
  /**
    * A unique identifier for a matchmaking ticket. You can include up to 10 ID values. 
    */
  var TicketIds: MatchmakingIdList = js.native
}
object DescribeMatchmakingInput {
  
  @scala.inline
  def apply(TicketIds: MatchmakingIdList): DescribeMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketIds = TicketIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingInput]
  }
  
  @scala.inline
  implicit class DescribeMatchmakingInputMutableBuilder[Self <: DescribeMatchmakingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicketIds(value: MatchmakingIdList): Self = StObject.set(x, "TicketIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketIdsVarargs(value: MatchmakingIdStringModel*): Self = StObject.set(x, "TicketIds", js.Array(value :_*))
  }
}

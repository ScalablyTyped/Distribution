package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMatchmakingOutput extends StObject {
  
  /**
    * A collection of existing matchmaking ticket objects matching the request.
    */
  var TicketList: js.UndefOr[MatchmakingTicketList] = js.native
}
object DescribeMatchmakingOutput {
  
  @scala.inline
  def apply(): DescribeMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingOutput]
  }
  
  @scala.inline
  implicit class DescribeMatchmakingOutputMutableBuilder[Self <: DescribeMatchmakingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicketList(value: MatchmakingTicketList): Self = StObject.set(x, "TicketList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketListUndefined: Self = StObject.set(x, "TicketList", js.undefined)
    
    @scala.inline
    def setTicketListVarargs(value: MatchmakingTicket*): Self = StObject.set(x, "TicketList", js.Array(value :_*))
  }
}

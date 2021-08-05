package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMatchmakingOutput extends StObject {
  
  /**
    * A collection of existing matchmaking ticket objects matching the request.
    */
  var TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined
}
object DescribeMatchmakingOutput {
  
  inline def apply(): DescribeMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingOutput]
  }
  
  extension [Self <: DescribeMatchmakingOutput](x: Self) {
    
    inline def setTicketList(value: MatchmakingTicketList): Self = StObject.set(x, "TicketList", value.asInstanceOf[js.Any])
    
    inline def setTicketListUndefined: Self = StObject.set(x, "TicketList", js.undefined)
    
    inline def setTicketListVarargs(value: MatchmakingTicket*): Self = StObject.set(x, "TicketList", js.Array(value :_*))
  }
}

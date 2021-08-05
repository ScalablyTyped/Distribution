package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareTickets extends StObject {
  
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String]
}
object ShareTickets {
  
  inline def apply(shareTickets: js.Array[String]): ShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTickets]
  }
  
  extension [Self <: ShareTickets](x: Self) {
    
    inline def setShareTickets(value: js.Array[String]): Self = StObject.set(x, "shareTickets", value.asInstanceOf[js.Any])
    
    inline def setShareTicketsVarargs(value: String*): Self = StObject.set(x, "shareTickets", js.Array(value :_*))
  }
}

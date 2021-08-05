package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseStatusFilter extends StObject {
  
  /**
    *  The close status that must match the close status of an execution for it to meet the criteria of this filter.
    */
  var status: CloseStatus
}
object CloseStatusFilter {
  
  inline def apply(status: CloseStatus): CloseStatusFilter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseStatusFilter]
  }
  
  extension [Self <: CloseStatusFilter](x: Self) {
    
    inline def setStatus(value: CloseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

package typings.bullBoard.anon

import typings.bullBoard.distAppMod.SelectedStatuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: SelectedStatuses
}
object Status {
  
  inline def apply(status: SelectedStatuses): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SelectedStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

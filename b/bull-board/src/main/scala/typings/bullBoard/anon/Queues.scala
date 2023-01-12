package typings.bullBoard.anon

import typings.bullBoard.distAppMod.SelectedStatuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queues extends StObject {
  
  var queues: js.UndefOr[js.Array[String]] = js.undefined
  
  var selectedStatuses: SelectedStatuses
}
object Queues {
  
  inline def apply(selectedStatuses: SelectedStatuses): Queues = {
    val __obj = js.Dynamic.literal(selectedStatuses = selectedStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Queues] (val x: Self) extends AnyVal {
    
    inline def setQueues(value: js.Array[String]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
    
    inline def setQueuesVarargs(value: String*): Self = StObject.set(x, "queues", js.Array(value*))
    
    inline def setSelectedStatuses(value: SelectedStatuses): Self = StObject.set(x, "selectedStatuses", value.asInstanceOf[js.Any])
  }
}

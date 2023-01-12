package typings.bullBoard.anon

import typings.bullBoard.distAppMod.AppQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  var queue: AppQueue
}
object Queue {
  
  inline def apply(queue: AppQueue): Queue = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    inline def setQueue(value: AppQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}

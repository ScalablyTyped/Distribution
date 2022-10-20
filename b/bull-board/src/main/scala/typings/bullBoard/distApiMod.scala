package typings.bullBoard

import typings.bullBoard.anon.PartialValidMetrics
import typings.bullBoard.distAppMod.AppQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiMod {
  
  trait GetQueues extends StObject {
    
    var queues: js.Array[AppQueue]
    
    var stats: PartialValidMetrics
  }
  object GetQueues {
    
    inline def apply(queues: js.Array[AppQueue], stats: PartialValidMetrics): GetQueues = {
      val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueues]
    }
    
    extension [Self <: GetQueues](x: Self) {
      
      inline def setQueues(value: js.Array[AppQueue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setQueuesVarargs(value: AppQueue*): Self = StObject.set(x, "queues", js.Array(value*))
      
      inline def setStats(value: PartialValidMetrics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}

package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCounts extends StObject {
  
  var active: Double
  
  var completed: Double
  
  var delayed: Double
  
  var failed: Double
  
  var waiting: Double
}
object JobCounts {
  
  inline def apply(active: Double, completed: Double, delayed: Double, failed: Double, waiting: Double): JobCounts = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobCounts] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDelayed(value: Double): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}

package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<bull-board.bull-board/dist/ui/components/constants.Status, number> */
trait RecordStatusnumber extends StObject {
  
  var active: Double
  
  var completed: Double
  
  var delayed: Double
  
  var failed: Double
  
  var latest: Double
  
  var paused: Double
  
  var waiting: Double
}
object RecordStatusnumber {
  
  inline def apply(
    active: Double,
    completed: Double,
    delayed: Double,
    failed: Double,
    latest: Double,
    paused: Double,
    waiting: Double
  ): RecordStatusnumber = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordStatusnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordStatusnumber] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDelayed(value: Double): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setLatest(value: Double): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}

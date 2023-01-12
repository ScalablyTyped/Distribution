package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: String
  
  var completed: String
  
  var delayed: String
  
  var failed: String
  
  var latest: String
  
  var paused: String
  
  var waiting: String
}
object Active {
  
  inline def apply(
    active: String,
    completed: String,
    delayed: String,
    failed: String,
    latest: String,
    paused: String,
    waiting: String
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDelayed(value: String): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: String): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: String): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: String): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}

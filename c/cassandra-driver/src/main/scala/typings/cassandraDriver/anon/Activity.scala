package typings.cassandraDriver.anon

import typings.cassandraDriver.libTypesMod.types.Uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  var activity: Any
  
  var elapsed: Any
  
  var id: Uuid
  
  var source: Any
  
  var thread: Any
}
object Activity {
  
  inline def apply(activity: Any, elapsed: Any, id: Uuid, source: Any, thread: Any): Activity = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  extension [Self <: Activity](x: Self) {
    
    inline def setActivity(value: Any): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setElapsed(value: Any): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setThread(value: Any): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
  }
}

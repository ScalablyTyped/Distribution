package typings.cassandraDriver.anon

import typings.cassandraDriver.typesMod.types.Uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  var activity: js.Any
  
  var elapsed: js.Any
  
  var id: Uuid
  
  var source: js.Any
  
  var thread: js.Any
}
object Activity {
  
  @scala.inline
  def apply(activity: js.Any, elapsed: js.Any, id: Uuid, source: js.Any, thread: js.Any): Activity = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: js.Any): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed(value: js.Any): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread(value: js.Any): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
  }
}

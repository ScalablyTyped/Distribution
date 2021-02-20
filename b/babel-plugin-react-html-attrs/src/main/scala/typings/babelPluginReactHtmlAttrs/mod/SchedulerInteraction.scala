package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defined in scheduler/tracing
  */
@js.native
trait SchedulerInteraction extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var timestamp: Double = js.native
}
object SchedulerInteraction {
  
  @scala.inline
  def apply(id: Double, name: String, timestamp: Double): SchedulerInteraction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerInteraction]
  }
  
  @scala.inline
  implicit class SchedulerInteractionMutableBuilder[Self <: SchedulerInteraction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

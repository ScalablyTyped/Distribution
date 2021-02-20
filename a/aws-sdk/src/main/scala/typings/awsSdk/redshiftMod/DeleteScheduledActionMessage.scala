package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScheduledActionMessage extends StObject {
  
  /**
    * The name of the scheduled action to delete. 
    */
  var ScheduledActionName: String = js.native
}
object DeleteScheduledActionMessage {
  
  @scala.inline
  def apply(ScheduledActionName: String): DeleteScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionMessage]
  }
  
  @scala.inline
  implicit class DeleteScheduledActionMessageMutableBuilder[Self <: DeleteScheduledActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
  }
}

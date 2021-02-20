package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySnapshotScheduleMessage extends StObject {
  
  /**
    * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
    */
  var ScheduleDefinitions: ScheduleDefinitionList = js.native
  
  /**
    * A unique alphanumeric identifier of the schedule to modify.
    */
  var ScheduleIdentifier: String = js.native
}
object ModifySnapshotScheduleMessage {
  
  @scala.inline
  def apply(ScheduleDefinitions: ScheduleDefinitionList, ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleDefinitions = ScheduleDefinitions.asInstanceOf[js.Any], ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit class ModifySnapshotScheduleMessageMutableBuilder[Self <: ModifySnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = StObject.set(x, "ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = StObject.set(x, "ScheduleDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
  }
}

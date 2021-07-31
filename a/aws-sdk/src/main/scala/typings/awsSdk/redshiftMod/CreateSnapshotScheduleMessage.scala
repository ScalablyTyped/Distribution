package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotScheduleMessage extends StObject {
  
  /**
    * 
    */
  var DryRun: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * 
    */
  var NextInvocations: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
  
  /**
    * The description of the snapshot schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * An optional set of tags you can use to search for the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSnapshotScheduleMessage {
  
  @scala.inline
  def apply(): CreateSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit class CreateSnapshotScheduleMessageMutableBuilder[Self <: CreateSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: BooleanOptional): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNextInvocations(value: IntegerOptional): Self = StObject.set(x, "NextInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextInvocationsUndefined: Self = StObject.set(x, "NextInvocations", js.undefined)
    
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = StObject.set(x, "ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleDefinitionsUndefined: Self = StObject.set(x, "ScheduleDefinitions", js.undefined)
    
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = StObject.set(x, "ScheduleDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setScheduleDescription(value: String): Self = StObject.set(x, "ScheduleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleDescriptionUndefined: Self = StObject.set(x, "ScheduleDescription", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleIdentifierUndefined: Self = StObject.set(x, "ScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

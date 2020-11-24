package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotScheduleMessage extends js.Object {
  
  /**
    * 
    */
  var DryRun: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * 
    */
  var NextInvocations: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  
  /**
    * The description of the snapshot schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  
  /**
    * An optional set of tags you can use to search for the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateSnapshotScheduleMessage {
  
  @scala.inline
  def apply(): CreateSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit class CreateSnapshotScheduleMessageOps[Self <: CreateSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDryRun(value: BooleanOptional): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setNextInvocations(value: IntegerOptional): Self = this.set("NextInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextInvocations: Self = this.set("NextInvocations", js.undefined)
    
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = this.set("ScheduleDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = this.set("ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleDefinitions: Self = this.set("ScheduleDefinitions", js.undefined)
    
    @scala.inline
    def setScheduleDescription(value: String): Self = this.set("ScheduleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleDescription: Self = this.set("ScheduleDescription", js.undefined)
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = this.set("ScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleIdentifier: Self = this.set("ScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

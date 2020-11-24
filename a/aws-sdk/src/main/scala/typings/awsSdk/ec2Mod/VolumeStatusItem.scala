package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusItem extends js.Object {
  
  /**
    * The details of the operation.
    */
  var Actions: js.UndefOr[VolumeStatusActionsList] = js.native
  
  /**
    * Information about the instances to which the volume is attached.
    */
  var AttachmentStatuses: js.UndefOr[VolumeStatusAttachmentStatusList] = js.native
  
  /**
    * The Availability Zone of the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * A list of events associated with the volume.
    */
  var Events: js.UndefOr[VolumeStatusEventsList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
  
  /**
    * The volume status.
    */
  var VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.native
}
object VolumeStatusItem {
  
  @scala.inline
  def apply(): VolumeStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusItem]
  }
  
  @scala.inline
  implicit class VolumeStatusItemOps[Self <: VolumeStatusItem] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: VolumeStatusAction*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: VolumeStatusActionsList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    
    @scala.inline
    def setAttachmentStatusesVarargs(value: VolumeStatusAttachmentStatus*): Self = this.set("AttachmentStatuses", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentStatuses(value: VolumeStatusAttachmentStatusList): Self = this.set("AttachmentStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentStatuses: Self = this.set("AttachmentStatuses", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: VolumeStatusEvent*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: VolumeStatusEventsList): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeStatus(value: VolumeStatusInfo): Self = this.set("VolumeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeStatus: Self = this.set("VolumeStatus", js.undefined)
  }
}

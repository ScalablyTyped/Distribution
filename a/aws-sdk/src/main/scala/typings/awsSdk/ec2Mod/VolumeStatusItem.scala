package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusItem extends StObject {
  
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
  implicit class VolumeStatusItemMutableBuilder[Self <: VolumeStatusItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: VolumeStatusActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: VolumeStatusAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentStatuses(value: VolumeStatusAttachmentStatusList): Self = StObject.set(x, "AttachmentStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentStatusesUndefined: Self = StObject.set(x, "AttachmentStatuses", js.undefined)
    
    @scala.inline
    def setAttachmentStatusesVarargs(value: VolumeStatusAttachmentStatus*): Self = StObject.set(x, "AttachmentStatuses", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEvents(value: VolumeStatusEventsList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: VolumeStatusEvent*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeStatus(value: VolumeStatusInfo): Self = StObject.set(x, "VolumeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeStatusUndefined: Self = StObject.set(x, "VolumeStatus", js.undefined)
  }
}

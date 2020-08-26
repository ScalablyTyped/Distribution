package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * An array of objects representing the add-ons enabled on the disk.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.native
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[String] = js.native
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.native
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.native
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The disk path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOnsVarargs(value: AddOn*): Self = this.set("addOns", js.Array(value :_*))
    @scala.inline
    def setAddOns(value: AddOnList): Self = this.set("addOns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAttachedTo(value: ResourceName): Self = this.set("attachedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedTo: Self = this.set("attachedTo", js.undefined)
    @scala.inline
    def setAttachmentState(value: String): Self = this.set("attachmentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentState: Self = this.set("attachmentState", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setGbInUse(value: integer): Self = this.set("gbInUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGbInUse: Self = this.set("gbInUse", js.undefined)
    @scala.inline
    def setIops(value: integer): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setIsAttached(value: Boolean): Self = this.set("isAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAttached: Self = this.set("isAttached", js.undefined)
    @scala.inline
    def setIsSystemDisk(value: Boolean): Self = this.set("isSystemDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSystemDisk: Self = this.set("isSystemDisk", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
    @scala.inline
    def setState(value: DiskState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


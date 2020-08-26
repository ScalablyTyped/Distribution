package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The progress of the disk snapshot operation.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object DiskSnapshot {
  @scala.inline
  def apply(): DiskSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshot]
  }
  @scala.inline
  implicit class DiskSnapshotOps[Self <: DiskSnapshot] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setFromDiskArn(value: NonEmptyString): Self = this.set("fromDiskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDiskArn: Self = this.set("fromDiskArn", js.undefined)
    @scala.inline
    def setFromDiskName(value: ResourceName): Self = this.set("fromDiskName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDiskName: Self = this.set("fromDiskName", js.undefined)
    @scala.inline
    def setFromInstanceArn(value: NonEmptyString): Self = this.set("fromInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromInstanceArn: Self = this.set("fromInstanceArn", js.undefined)
    @scala.inline
    def setFromInstanceName(value: ResourceName): Self = this.set("fromInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromInstanceName: Self = this.set("fromInstanceName", js.undefined)
    @scala.inline
    def setIsFromAutoSnapshot(value: Boolean): Self = this.set("isFromAutoSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFromAutoSnapshot: Self = this.set("isFromAutoSnapshot", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
    @scala.inline
    def setState(value: DiskSnapshotState): Self = this.set("state", value.asInstanceOf[js.Any])
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


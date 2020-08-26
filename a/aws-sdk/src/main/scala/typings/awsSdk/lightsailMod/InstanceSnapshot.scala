package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the snapshot (e.g., arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the snapshot was created (e.g., 1479907467.024).
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * An array of disk objects containing information about all block storage disks.
    */
  var fromAttachedDisks: js.UndefOr[DiskList] = js.native
  /**
    * The blueprint ID from which you created the snapshot (e.g., os_debian_8_3). A blueprint is a virtual private server (or instance) image used to create instances quickly.
    */
  var fromBlueprintId: js.UndefOr[String] = js.native
  /**
    * The bundle ID from which you created the snapshot (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE).
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance from which the snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * The region name and Availability Zone where you created the snapshot.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The progress of the snapshot.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * The type of resource (usually InstanceSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size in GB of the SSD.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The state the snapshot is in.
    */
  var state: js.UndefOr[InstanceSnapshotState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object InstanceSnapshot {
  @scala.inline
  def apply(): InstanceSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshot]
  }
  @scala.inline
  implicit class InstanceSnapshotOps[Self <: InstanceSnapshot] (val x: Self) extends AnyVal {
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
    def setFromAttachedDisksVarargs(value: Disk*): Self = this.set("fromAttachedDisks", js.Array(value :_*))
    @scala.inline
    def setFromAttachedDisks(value: DiskList): Self = this.set("fromAttachedDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromAttachedDisks: Self = this.set("fromAttachedDisks", js.undefined)
    @scala.inline
    def setFromBlueprintId(value: String): Self = this.set("fromBlueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromBlueprintId: Self = this.set("fromBlueprintId", js.undefined)
    @scala.inline
    def setFromBundleId(value: String): Self = this.set("fromBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromBundleId: Self = this.set("fromBundleId", js.undefined)
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
    def setState(value: InstanceSnapshotState): Self = this.set("state", value.asInstanceOf[js.Any])
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


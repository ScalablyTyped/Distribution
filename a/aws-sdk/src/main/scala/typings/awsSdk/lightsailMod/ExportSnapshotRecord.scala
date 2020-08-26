package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRecord extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.native
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.native
}

object ExportSnapshotRecord {
  @scala.inline
  def apply(): ExportSnapshotRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
  @scala.inline
  implicit class ExportSnapshotRecordOps[Self <: ExportSnapshotRecord] (val x: Self) extends AnyVal {
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
    def setDestinationInfo(value: DestinationInfo): Self = this.set("destinationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationInfo: Self = this.set("destinationInfo", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSourceInfo(value: ExportSnapshotRecordSourceInfo): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    @scala.inline
    def setState(value: RecordState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportJobResource extends js.Object {
  /**
    * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are imported.
    */
  var DefineSegment: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[string] = js.native
  /**
    * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format. If the files are stored in an Amazon S3 location and that location contains multiple files that use different formats, Amazon Pinpoint imports data only from the files that use the specified format.
    */
  var Format: typings.awsSdk.pinpointMod.Format = js.native
  /**
    * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are imported.
    */
  var RegisterEndpoints: js.UndefOr[boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: string = js.native
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint definitions from the files in this location, including any subfolders that the folder contains. The URL should be in the following format: s3://bucket-name/folder-name/file-name. The location can end with the key for an individual object or a prefix that qualifies multiple objects.
    */
  var S3Url: string = js.native
  /**
    * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job updates an existing segment.
    */
  var SegmentId: js.UndefOr[string] = js.native
  /**
    * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is true.
    */
  var SegmentName: js.UndefOr[string] = js.native
}

object ImportJobResource {
  @scala.inline
  def apply(Format: Format, RoleArn: string, S3Url: string): ImportJobResource = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResource]
  }
  @scala.inline
  implicit class ImportJobResourceOps[Self <: ImportJobResource] (val x: Self) extends AnyVal {
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
    def setFormat(value: Format): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Url(value: string): Self = this.set("S3Url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineSegment(value: boolean): Self = this.set("DefineSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefineSegment: Self = this.set("DefineSegment", js.undefined)
    @scala.inline
    def setExternalId(value: string): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setRegisterEndpoints(value: boolean): Self = this.set("RegisterEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterEndpoints: Self = this.set("RegisterEndpoints", js.undefined)
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    @scala.inline
    def setSegmentName(value: string): Self = this.set("SegmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentName: Self = this.set("SegmentName", js.undefined)
  }
  
}


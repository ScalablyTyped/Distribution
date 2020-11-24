package typings.awsSdkClientPinpointBrowser.typesImportJobResourceMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJobResource extends js.Object {
  
  /**
    * Sets whether the endpoints create a segment when they are imported.
    */
  var DefineSegment: js.UndefOr[Boolean] = js.native
  
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.native
  
  /**
    * The format of the files that contain the endpoint definitions.
    * Valid values: CSV, JSON
    */
  var Format: js.UndefOr[CSV | JSON | String] = js.native
  
  /**
    * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
    */
  var RegisterEndpoints: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
    */
  var RoleArn: js.UndefOr[String] = js.native
  
  /**
    * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
    *
    * Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
    */
  var S3Url: js.UndefOr[String] = js.native
  
  /**
    * The ID of the segment to update if the import job is meant to update an existing segment.
    */
  var SegmentId: js.UndefOr[String] = js.native
  
  /**
    * A custom name for the segment created by the import job. Use if DefineSegment is true.
    */
  var SegmentName: js.UndefOr[String] = js.native
}
object ImportJobResource {
  
  @scala.inline
  def apply(): ImportJobResource = {
    val __obj = js.Dynamic.literal()
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
    def setDefineSegment(value: Boolean): Self = this.set("DefineSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefineSegment: Self = this.set("DefineSegment", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    
    @scala.inline
    def setFormat(value: CSV | JSON | String): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setRegisterEndpoints(value: Boolean): Self = this.set("RegisterEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterEndpoints: Self = this.set("RegisterEndpoints", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setS3Url(value: String): Self = this.set("S3Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Url: Self = this.set("S3Url", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    
    @scala.inline
    def setSegmentName(value: String): Self = this.set("SegmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentName: Self = this.set("SegmentName", js.undefined)
  }
}

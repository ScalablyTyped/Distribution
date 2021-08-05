package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobResource extends StObject {
  
  /**
    * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are imported.
    */
  var DefineSegment: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[string] = js.undefined
  
  /**
    * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format. If the files are stored in an Amazon S3 location and that location contains multiple files that use different formats, Amazon Pinpoint imports data only from the files that use the specified format.
    */
  var Format: typings.awsSdk.pinpointMod.Format
  
  /**
    * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are imported.
    */
  var RegisterEndpoints: js.UndefOr[boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: string
  
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint definitions from the files in this location, including any subfolders that the folder contains. The URL should be in the following format: s3://bucket-name/folder-name/file-name. The location can end with the key for an individual object or a prefix that qualifies multiple objects.
    */
  var S3Url: string
  
  /**
    * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job updates an existing segment.
    */
  var SegmentId: js.UndefOr[string] = js.undefined
  
  /**
    * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is true.
    */
  var SegmentName: js.UndefOr[string] = js.undefined
}
object ImportJobResource {
  
  inline def apply(Format: Format, RoleArn: string, S3Url: string): ImportJobResource = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResource]
  }
  
  extension [Self <: ImportJobResource](x: Self) {
    
    inline def setDefineSegment(value: boolean): Self = StObject.set(x, "DefineSegment", value.asInstanceOf[js.Any])
    
    inline def setDefineSegmentUndefined: Self = StObject.set(x, "DefineSegment", js.undefined)
    
    inline def setExternalId(value: string): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setRegisterEndpoints(value: boolean): Self = StObject.set(x, "RegisterEndpoints", value.asInstanceOf[js.Any])
    
    inline def setRegisterEndpointsUndefined: Self = StObject.set(x, "RegisterEndpoints", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3Url(value: string): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
    
    inline def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
    
    inline def setSegmentName(value: string): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
  }
}

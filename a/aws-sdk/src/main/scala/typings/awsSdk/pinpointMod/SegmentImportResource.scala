package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentImportResource extends StObject {
  
  /**
    * The number of channel types in the endpoint definitions that were imported to create the segment.
    */
  var ChannelCounts: js.UndefOr[MapOfInteger] = js.undefined
  
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: string
  
  /**
    * The format of the files that were imported to create the segment. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format.
    */
  var Format: typings.awsSdk.pinpointMod.Format
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: string
  
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the endpoint definitions were imported from to create the segment.
    */
  var S3Url: string
  
  /**
    * The number of endpoint definitions that were imported successfully to create the segment.
    */
  var Size: integer
}
object SegmentImportResource {
  
  inline def apply(ExternalId: string, Format: Format, RoleArn: string, S3Url: string, Size: integer): SegmentImportResource = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentImportResource]
  }
  
  extension [Self <: SegmentImportResource](x: Self) {
    
    inline def setChannelCounts(value: MapOfInteger): Self = StObject.set(x, "ChannelCounts", value.asInstanceOf[js.Any])
    
    inline def setChannelCountsUndefined: Self = StObject.set(x, "ChannelCounts", js.undefined)
    
    inline def setExternalId(value: string): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3Url(value: string): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}

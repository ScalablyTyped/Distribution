package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesImportJobResourceMod {
  
  trait ImportJobResource extends StObject {
    
    /**
      * Sets whether the endpoints create a segment when they are imported.
      */
    var DefineSegment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[String] = js.undefined
    
    /**
      * The format of the files that contain the endpoint definitions.
      * Valid values: CSV, JSON
      */
    var Format: js.UndefOr[CSV | JSON | String] = js.undefined
    
    /**
      * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
      */
    var RegisterEndpoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
      *
      * Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
      */
    var S3Url: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the segment to update if the import job is meant to update an existing segment.
      */
    var SegmentId: js.UndefOr[String] = js.undefined
    
    /**
      * A custom name for the segment created by the import job. Use if DefineSegment is true.
      */
    var SegmentName: js.UndefOr[String] = js.undefined
  }
  object ImportJobResource {
    
    inline def apply(): ImportJobResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportJobResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportJobResource] (val x: Self) extends AnyVal {
      
      inline def setDefineSegment(value: Boolean): Self = StObject.set(x, "DefineSegment", value.asInstanceOf[js.Any])
      
      inline def setDefineSegmentUndefined: Self = StObject.set(x, "DefineSegment", js.undefined)
      
      inline def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      inline def setFormat(value: CSV | JSON | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
      
      inline def setRegisterEndpoints(value: Boolean): Self = StObject.set(x, "RegisterEndpoints", value.asInstanceOf[js.Any])
      
      inline def setRegisterEndpointsUndefined: Self = StObject.set(x, "RegisterEndpoints", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setS3Url(value: String): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
      
      inline def setS3UrlUndefined: Self = StObject.set(x, "S3Url", js.undefined)
      
      inline def setSegmentId(value: String): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
      
      inline def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
      
      inline def setSegmentName(value: String): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
      
      inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
    }
  }
  
  type UnmarshalledImportJobResource = ImportJobResource
}

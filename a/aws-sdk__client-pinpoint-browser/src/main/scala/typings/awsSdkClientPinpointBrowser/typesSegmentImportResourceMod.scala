package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentImportResourceMod {
  
  trait SegmentImportResource extends StObject {
    
    /**
      * The number of channel types in the imported segment.
      */
    var ChannelCounts: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
    
    /**
      * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
      */
    var ExternalId: js.UndefOr[String] = js.undefined
    
    /**
      * The format of the endpoint files that were imported to create this segment.
      * Valid values: CSV, JSON
      */
    var Format: js.UndefOr[CSV | JSON | String] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the S3 bucket that the segment was imported from.
      */
    var S3Url: js.UndefOr[String] = js.undefined
    
    /**
      * The number of endpoints that were successfully imported to create this segment.
      */
    var Size: js.UndefOr[Double] = js.undefined
  }
  object SegmentImportResource {
    
    @scala.inline
    def apply(): SegmentImportResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentImportResource]
    }
    
    @scala.inline
    implicit class SegmentImportResourceMutableBuilder[Self <: SegmentImportResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelCounts(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "ChannelCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCountsUndefined: Self = StObject.set(x, "ChannelCounts", js.undefined)
      
      @scala.inline
      def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      @scala.inline
      def setFormat(value: CSV | JSON | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      @scala.inline
      def setS3Url(value: String): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3UrlUndefined: Self = StObject.set(x, "S3Url", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentImportResource
    extends StObject
       with SegmentImportResource {
    
    /**
      * The number of channel types in the imported segment.
      */
    @JSName("ChannelCounts")
    var ChannelCounts_UnmarshalledSegmentImportResource: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object UnmarshalledSegmentImportResource {
    
    @scala.inline
    def apply(): UnmarshalledSegmentImportResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentImportResource]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentImportResourceMutableBuilder[Self <: UnmarshalledSegmentImportResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelCounts(value: StringDictionary[Double]): Self = StObject.set(x, "ChannelCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCountsUndefined: Self = StObject.set(x, "ChannelCounts", js.undefined)
    }
  }
}

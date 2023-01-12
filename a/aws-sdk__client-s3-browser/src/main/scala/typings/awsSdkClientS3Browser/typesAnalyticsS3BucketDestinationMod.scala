package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsS3BucketDestinationMod {
  
  trait AnalyticsS3BucketDestination extends StObject {
    
    /**
      * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
      */
    var Bucket: String
    
    /**
      * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
      */
    var BucketAccountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The file format used when exporting data to Amazon S3.</p>
      */
    var Format: CSV | String
    
    /**
      * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
  }
  object AnalyticsS3BucketDestination {
    
    inline def apply(Bucket: String, Format: CSV | String): AnalyticsS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsS3BucketDestination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketAccountId(value: String): Self = StObject.set(x, "BucketAccountId", value.asInstanceOf[js.Any])
      
      inline def setBucketAccountIdUndefined: Self = StObject.set(x, "BucketAccountId", js.undefined)
      
      inline def setFormat(value: CSV | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  type UnmarshalledAnalyticsS3BucketDestination = AnalyticsS3BucketDestination
}

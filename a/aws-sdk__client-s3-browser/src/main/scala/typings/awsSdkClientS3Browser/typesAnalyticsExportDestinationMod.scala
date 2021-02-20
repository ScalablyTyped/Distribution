package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod.AnalyticsS3BucketDestination
import typings.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod.UnmarshalledAnalyticsS3BucketDestination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsExportDestinationMod {
  
  @js.native
  trait AnalyticsExportDestination extends StObject {
    
    /**
      * <p>A destination signifying output to an S3 bucket.</p>
      */
    var S3BucketDestination: AnalyticsS3BucketDestination = js.native
  }
  object AnalyticsExportDestination {
    
    @scala.inline
    def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsExportDestination]
    }
    
    @scala.inline
    implicit class AnalyticsExportDestinationMutableBuilder[Self <: AnalyticsExportDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3BucketDestination(value: AnalyticsS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledAnalyticsExportDestination extends AnalyticsExportDestination {
    
    /**
      * <p>A destination signifying output to an S3 bucket.</p>
      */
    @JSName("S3BucketDestination")
    var S3BucketDestination_UnmarshalledAnalyticsExportDestination: UnmarshalledAnalyticsS3BucketDestination = js.native
  }
  object UnmarshalledAnalyticsExportDestination {
    
    @scala.inline
    def apply(S3BucketDestination: UnmarshalledAnalyticsS3BucketDestination): UnmarshalledAnalyticsExportDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAnalyticsExportDestination]
    }
    
    @scala.inline
    implicit class UnmarshalledAnalyticsExportDestinationMutableBuilder[Self <: UnmarshalledAnalyticsExportDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3BucketDestination(value: UnmarshalledAnalyticsS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
}

package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesAnalyticsS3BucketDestinationMod.AnalyticsS3BucketDestination
import typings.awsSdkClientS3Node.typesAnalyticsS3BucketDestinationMod.UnmarshalledAnalyticsS3BucketDestination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsExportDestinationMod {
  
  trait AnalyticsExportDestination extends StObject {
    
    /**
      * <p>A destination signifying output to an S3 bucket.</p>
      */
    var S3BucketDestination: AnalyticsS3BucketDestination
  }
  object AnalyticsExportDestination {
    
    inline def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsExportDestination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsExportDestination] (val x: Self) extends AnyVal {
      
      inline def setS3BucketDestination(value: AnalyticsS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledAnalyticsExportDestination
    extends StObject
       with AnalyticsExportDestination {
    
    /**
      * <p>A destination signifying output to an S3 bucket.</p>
      */
    @JSName("S3BucketDestination")
    var S3BucketDestination_UnmarshalledAnalyticsExportDestination: UnmarshalledAnalyticsS3BucketDestination
  }
  object UnmarshalledAnalyticsExportDestination {
    
    inline def apply(S3BucketDestination: UnmarshalledAnalyticsS3BucketDestination): UnmarshalledAnalyticsExportDestination = {
      val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAnalyticsExportDestination]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledAnalyticsExportDestination] (val x: Self) extends AnyVal {
      
      inline def setS3BucketDestination(value: UnmarshalledAnalyticsS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
    }
  }
}

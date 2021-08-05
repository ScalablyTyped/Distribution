package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled
import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketLoggingStatusMod {
  
  trait BucketLoggingStatus extends StObject {
    
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[typings.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled] = js.undefined
  }
  object BucketLoggingStatus {
    
    inline def apply(): BucketLoggingStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLoggingStatus]
    }
    
    extension [Self <: BucketLoggingStatus](x: Self) {
      
      inline def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    }
  }
  
  trait UnmarshalledBucketLoggingStatus
    extends StObject
       with BucketLoggingStatus {
    
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    @JSName("LoggingEnabled")
    var LoggingEnabled_UnmarshalledBucketLoggingStatus: js.UndefOr[UnmarshalledLoggingEnabled] = js.undefined
  }
  object UnmarshalledBucketLoggingStatus {
    
    inline def apply(): UnmarshalledBucketLoggingStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBucketLoggingStatus]
    }
    
    extension [Self <: UnmarshalledBucketLoggingStatus](x: Self) {
      
      inline def setLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    }
  }
}

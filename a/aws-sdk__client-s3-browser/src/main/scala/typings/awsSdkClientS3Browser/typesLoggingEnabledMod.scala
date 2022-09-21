package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTargetGrantMod.TargetGrant
import typings.awsSdkClientS3Browser.typesTargetGrantMod.UnmarshalledTargetGrant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggingEnabledMod {
  
  trait LoggingEnabled extends StObject {
    
    /**
      * <p>Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.</p>
      */
    var TargetBucket: String
    
    /**
      * _TargetGrants shape
      */
    var TargetGrants: js.UndefOr[js.Array[TargetGrant] | js.Iterable[TargetGrant]] = js.undefined
    
    /**
      * <p>This element lets you specify a prefix for the keys that the log files will be stored under.</p>
      */
    var TargetPrefix: String
  }
  object LoggingEnabled {
    
    inline def apply(TargetBucket: String, TargetPrefix: String): LoggingEnabled = {
      val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggingEnabled]
    }
    
    extension [Self <: LoggingEnabled](x: Self) {
      
      inline def setTargetBucket(value: String): Self = StObject.set(x, "TargetBucket", value.asInstanceOf[js.Any])
      
      inline def setTargetGrants(value: js.Array[TargetGrant] | js.Iterable[TargetGrant]): Self = StObject.set(x, "TargetGrants", value.asInstanceOf[js.Any])
      
      inline def setTargetGrantsUndefined: Self = StObject.set(x, "TargetGrants", js.undefined)
      
      inline def setTargetGrantsVarargs(value: TargetGrant*): Self = StObject.set(x, "TargetGrants", js.Array(value*))
      
      inline def setTargetPrefix(value: String): Self = StObject.set(x, "TargetPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledLoggingEnabled
    extends StObject
       with LoggingEnabled {
    
    /**
      * _TargetGrants shape
      */
    @JSName("TargetGrants")
    var TargetGrants_UnmarshalledLoggingEnabled: js.UndefOr[js.Array[UnmarshalledTargetGrant]] = js.undefined
  }
  object UnmarshalledLoggingEnabled {
    
    inline def apply(TargetBucket: String, TargetPrefix: String): UnmarshalledLoggingEnabled = {
      val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLoggingEnabled]
    }
    
    extension [Self <: UnmarshalledLoggingEnabled](x: Self) {
      
      inline def setTargetGrants(value: js.Array[UnmarshalledTargetGrant]): Self = StObject.set(x, "TargetGrants", value.asInstanceOf[js.Any])
      
      inline def setTargetGrantsUndefined: Self = StObject.set(x, "TargetGrants", js.undefined)
      
      inline def setTargetGrantsVarargs(value: UnmarshalledTargetGrant*): Self = StObject.set(x, "TargetGrants", js.Array(value*))
    }
  }
}

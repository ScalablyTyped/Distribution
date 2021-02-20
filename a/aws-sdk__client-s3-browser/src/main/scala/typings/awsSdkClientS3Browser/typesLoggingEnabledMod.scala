package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTargetGrantMod.TargetGrant
import typings.awsSdkClientS3Browser.typesTargetGrantMod.UnmarshalledTargetGrant
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggingEnabledMod {
  
  @js.native
  trait LoggingEnabled extends StObject {
    
    /**
      * <p>Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.</p>
      */
    var TargetBucket: String = js.native
    
    /**
      * _TargetGrants shape
      */
    var TargetGrants: js.UndefOr[js.Array[TargetGrant] | Iterable[TargetGrant]] = js.native
    
    /**
      * <p>This element lets you specify a prefix for the keys that the log files will be stored under.</p>
      */
    var TargetPrefix: String = js.native
  }
  object LoggingEnabled {
    
    @scala.inline
    def apply(TargetBucket: String, TargetPrefix: String): LoggingEnabled = {
      val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggingEnabled]
    }
    
    @scala.inline
    implicit class LoggingEnabledMutableBuilder[Self <: LoggingEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetBucket(value: String): Self = StObject.set(x, "TargetBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGrants(value: js.Array[TargetGrant] | Iterable[TargetGrant]): Self = StObject.set(x, "TargetGrants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGrantsUndefined: Self = StObject.set(x, "TargetGrants", js.undefined)
      
      @scala.inline
      def setTargetGrantsVarargs(value: TargetGrant*): Self = StObject.set(x, "TargetGrants", js.Array(value :_*))
      
      @scala.inline
      def setTargetPrefix(value: String): Self = StObject.set(x, "TargetPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledLoggingEnabled extends LoggingEnabled {
    
    /**
      * _TargetGrants shape
      */
    @JSName("TargetGrants")
    var TargetGrants_UnmarshalledLoggingEnabled: js.UndefOr[js.Array[UnmarshalledTargetGrant]] = js.native
  }
  object UnmarshalledLoggingEnabled {
    
    @scala.inline
    def apply(TargetBucket: String, TargetPrefix: String): UnmarshalledLoggingEnabled = {
      val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLoggingEnabled]
    }
    
    @scala.inline
    implicit class UnmarshalledLoggingEnabledMutableBuilder[Self <: UnmarshalledLoggingEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetGrants(value: js.Array[UnmarshalledTargetGrant]): Self = StObject.set(x, "TargetGrants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGrantsUndefined: Self = StObject.set(x, "TargetGrants", js.undefined)
      
      @scala.inline
      def setTargetGrantsVarargs(value: UnmarshalledTargetGrant*): Self = StObject.set(x, "TargetGrants", js.Array(value :_*))
    }
  }
}

package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDRTLogBucketRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains your AWS WAF logs.
    */
  var LogBucket: typings.awsSdk.shieldMod.LogBucket
}
object DisassociateDRTLogBucketRequest {
  
  @scala.inline
  def apply(LogBucket: LogBucket): DisassociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
  }
  
  @scala.inline
  implicit class DisassociateDRTLogBucketRequestMutableBuilder[Self <: DisassociateDRTLogBucketRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
  }
}

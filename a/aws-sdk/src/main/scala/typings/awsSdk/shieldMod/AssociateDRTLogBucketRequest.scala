package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDRTLogBucketRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains your AWS WAF logs.
    */
  var LogBucket: typings.awsSdk.shieldMod.LogBucket = js.native
}
object AssociateDRTLogBucketRequest {
  
  @scala.inline
  def apply(LogBucket: LogBucket): AssociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDRTLogBucketRequest]
  }
  
  @scala.inline
  implicit class AssociateDRTLogBucketRequestMutableBuilder[Self <: AssociateDRTLogBucketRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
  }
}

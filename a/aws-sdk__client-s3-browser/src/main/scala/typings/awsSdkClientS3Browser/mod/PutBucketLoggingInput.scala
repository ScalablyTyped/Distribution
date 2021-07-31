package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesBucketLoggingStatusMod.BucketLoggingStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketLoggingInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput
object PutBucketLoggingInput {
  
  @scala.inline
  def apply(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): PutBucketLoggingInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingInput]
  }
}

package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesBucketLoggingStatusMod.BucketLoggingStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketLoggingInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
object PutBucketLoggingInput {
  
  inline def apply(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): PutBucketLoggingInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingInput]
  }
}

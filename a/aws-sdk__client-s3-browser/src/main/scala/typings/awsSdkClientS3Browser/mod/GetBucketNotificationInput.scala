package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketNotificationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput
object GetBucketNotificationInput {
  
  inline def apply(Bucket: String): GetBucketNotificationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationInput]
  }
}

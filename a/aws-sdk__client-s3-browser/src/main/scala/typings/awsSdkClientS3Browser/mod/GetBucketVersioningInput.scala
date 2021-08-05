package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketVersioningInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput
object GetBucketVersioningInput {
  
  inline def apply(Bucket: String): GetBucketVersioningInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningInput]
  }
}

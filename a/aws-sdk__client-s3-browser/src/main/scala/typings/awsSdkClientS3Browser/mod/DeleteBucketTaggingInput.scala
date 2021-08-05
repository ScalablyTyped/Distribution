package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketTaggingInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
object DeleteBucketTaggingInput {
  
  inline def apply(Bucket: String): DeleteBucketTaggingInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketTaggingInput]
  }
}

package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketCorsInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
object DeleteBucketCorsInput {
  
  inline def apply(Bucket: String): DeleteBucketCorsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketCorsInput]
  }
}

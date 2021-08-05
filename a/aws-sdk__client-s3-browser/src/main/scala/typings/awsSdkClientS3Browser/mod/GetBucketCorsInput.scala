package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketCorsInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput
object GetBucketCorsInput {
  
  inline def apply(Bucket: String): GetBucketCorsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketCorsInput]
  }
}

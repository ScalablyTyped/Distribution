package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
object GetBucketPolicyInput {
  
  inline def apply(Bucket: String): GetBucketPolicyInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketPolicyInput]
  }
}

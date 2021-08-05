package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketPolicyInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
object PutBucketPolicyInput {
  
  inline def apply(Bucket: String, Policy: String): PutBucketPolicyInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyInput]
  }
}

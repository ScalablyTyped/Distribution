package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketEncryptionInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
object DeleteBucketEncryptionInput {
  
  @scala.inline
  def apply(Bucket: String): DeleteBucketEncryptionInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketEncryptionInput]
  }
}

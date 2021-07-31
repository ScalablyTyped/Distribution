package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketLifecycleInput
  extends StObject
     with typings.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
object DeleteBucketLifecycleInput {
  
  @scala.inline
  def apply(Bucket: String): DeleteBucketLifecycleInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketLifecycleInput]
  }
}

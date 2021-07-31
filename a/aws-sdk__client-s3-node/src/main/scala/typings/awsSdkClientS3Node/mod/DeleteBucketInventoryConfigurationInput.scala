package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketInventoryConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
object DeleteBucketInventoryConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, Id: String): DeleteBucketInventoryConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationInput]
  }
}

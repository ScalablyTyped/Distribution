package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketInventoryConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
object GetBucketInventoryConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, Id: String): GetBucketInventoryConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationInput]
  }
}

package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesInventoryConfigurationMod.InventoryConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketInventoryConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
object PutBucketInventoryConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): PutBucketInventoryConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketInventoryConfigurationInput]
  }
}

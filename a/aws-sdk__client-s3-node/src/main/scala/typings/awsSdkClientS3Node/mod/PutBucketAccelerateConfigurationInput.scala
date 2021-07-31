package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesAccelerateConfigurationMod.AccelerateConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketAccelerateConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
object PutBucketAccelerateConfigurationInput {
  
  @scala.inline
  def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): PutBucketAccelerateConfigurationInput = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAccelerateConfigurationInput]
  }
}

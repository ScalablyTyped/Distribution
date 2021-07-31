package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketEncryptionInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
object PutBucketEncryptionInput {
  
  @scala.inline
  def apply(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): PutBucketEncryptionInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionInput]
  }
}

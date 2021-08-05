package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketEncryptionInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
object PutBucketEncryptionInput {
  
  inline def apply(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): PutBucketEncryptionInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionInput]
  }
}

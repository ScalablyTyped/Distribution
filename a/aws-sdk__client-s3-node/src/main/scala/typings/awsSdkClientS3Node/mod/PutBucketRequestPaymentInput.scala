package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketRequestPaymentInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
object PutBucketRequestPaymentInput {
  
  inline def apply(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): PutBucketRequestPaymentInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentInput]
  }
}

package typings.awsSdkClientS3Node.typesRequestPaymentConfigurationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentConfiguration extends js.Object {
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: Requester | BucketOwner | String
}

object RequestPaymentConfiguration {
  @scala.inline
  def apply(Payer: Requester | BucketOwner | String): RequestPaymentConfiguration = {
    val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentConfiguration]
  }
}


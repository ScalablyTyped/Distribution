package typings.awsSdkClientS3Browser.typesRequestPaymentConfigurationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketOwner
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Requester
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


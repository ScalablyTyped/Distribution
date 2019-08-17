package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRequestPaymentConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketOwner
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RequestPaymentConfiguration extends js.Object {
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: Requester | BucketOwner | String
}

object _RequestPaymentConfiguration {
  @scala.inline
  def apply(Payer: Requester | BucketOwner | String): _RequestPaymentConfiguration = {
    val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_RequestPaymentConfiguration]
  }
}


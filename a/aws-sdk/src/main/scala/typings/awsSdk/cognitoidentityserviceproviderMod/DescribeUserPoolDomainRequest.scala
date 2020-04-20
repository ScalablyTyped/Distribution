package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolDomainRequest extends js.Object {
  /**
    * The domain string.
    */
  var Domain: DomainType = js.native
}

object DescribeUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType): DescribeUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolDomainRequest]
  }
}


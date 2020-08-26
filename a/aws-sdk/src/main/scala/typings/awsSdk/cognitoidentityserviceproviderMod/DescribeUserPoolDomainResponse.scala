package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolDomainResponse extends js.Object {
  /**
    * A domain description object containing information about the domain.
    */
  var DomainDescription: js.UndefOr[DomainDescriptionType] = js.native
}

object DescribeUserPoolDomainResponse {
  @scala.inline
  def apply(): DescribeUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolDomainResponse]
  }
  @scala.inline
  implicit class DescribeUserPoolDomainResponseOps[Self <: DescribeUserPoolDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainDescription(value: DomainDescriptionType): Self = this.set("DomainDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainDescription: Self = this.set("DomainDescription", js.undefined)
  }
  
}


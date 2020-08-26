package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceAccessPoliciesRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DescribeServiceAccessPoliciesRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceAccessPoliciesRequest]
  }
  @scala.inline
  implicit class DescribeServiceAccessPoliciesRequestOps[Self <: DescribeServiceAccessPoliciesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployed(value: Boolean): Self = this.set("Deployed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployed: Self = this.set("Deployed", js.undefined)
  }
  
}


package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSSLPoliciesInput extends js.Object {
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The names of the policies.
    */
  var Names: js.UndefOr[SslPolicyNames] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
}

object DescribeSSLPoliciesInput {
  @scala.inline
  def apply(): DescribeSSLPoliciesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesInput]
  }
  @scala.inline
  implicit class DescribeSSLPoliciesInputOps[Self <: DescribeSSLPoliciesInput] (val x: Self) extends AnyVal {
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setNamesVarargs(value: SslPolicyName*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: SslPolicyNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}


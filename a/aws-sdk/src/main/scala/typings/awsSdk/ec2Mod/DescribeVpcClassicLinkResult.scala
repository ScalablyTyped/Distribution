package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcClassicLinkResult extends js.Object {
  /**
    * The ClassicLink status of one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcClassicLinkList] = js.native
}

object DescribeVpcClassicLinkResult {
  @scala.inline
  def apply(): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
  @scala.inline
  implicit class DescribeVpcClassicLinkResultOps[Self <: DescribeVpcClassicLinkResult] (val x: Self) extends AnyVal {
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
    def setVpcsVarargs(value: VpcClassicLink*): Self = this.set("Vpcs", js.Array(value :_*))
    @scala.inline
    def setVpcs(value: VpcClassicLinkList): Self = this.set("Vpcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcs: Self = this.set("Vpcs", js.undefined)
  }
  
}


package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcList] = js.native
}

object DescribeVpcsResult {
  @scala.inline
  def apply(): DescribeVpcsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcsResult]
  }
  @scala.inline
  implicit class DescribeVpcsResultOps[Self <: DescribeVpcsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVpcsVarargs(value: Vpc*): Self = this.set("Vpcs", js.Array(value :_*))
    @scala.inline
    def setVpcs(value: VpcList): Self = this.set("Vpcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcs: Self = this.set("Vpcs", js.undefined)
  }
  
}


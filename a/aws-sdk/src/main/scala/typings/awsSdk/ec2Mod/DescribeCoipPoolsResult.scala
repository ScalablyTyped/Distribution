package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCoipPoolsResult extends js.Object {
  /**
    * Information about the address pools.
    */
  var CoipPools: js.UndefOr[CoipPoolSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeCoipPoolsResult {
  @scala.inline
  def apply(): DescribeCoipPoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCoipPoolsResult]
  }
  @scala.inline
  implicit class DescribeCoipPoolsResultOps[Self <: DescribeCoipPoolsResult] (val x: Self) extends AnyVal {
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
    def setCoipPoolsVarargs(value: CoipPool*): Self = this.set("CoipPools", js.Array(value :_*))
    @scala.inline
    def setCoipPools(value: CoipPoolSet): Self = this.set("CoipPools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoipPools: Self = this.set("CoipPools", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


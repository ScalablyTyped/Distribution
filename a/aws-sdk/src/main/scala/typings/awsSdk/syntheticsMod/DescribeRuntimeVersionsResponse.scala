package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuntimeVersionsResponse extends js.Object {
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeRuntimeVersions operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * An array of objects that display the details about each Synthetics canary runtime version.
    */
  var RuntimeVersions: js.UndefOr[RuntimeVersionList] = js.native
}

object DescribeRuntimeVersionsResponse {
  @scala.inline
  def apply(): DescribeRuntimeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeVersionsResponse]
  }
  @scala.inline
  implicit class DescribeRuntimeVersionsResponseOps[Self <: DescribeRuntimeVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRuntimeVersionsVarargs(value: RuntimeVersion*): Self = this.set("RuntimeVersions", js.Array(value :_*))
    @scala.inline
    def setRuntimeVersions(value: RuntimeVersionList): Self = this.set("RuntimeVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersions: Self = this.set("RuntimeVersions", js.undefined)
  }
  
}


package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesHealthResult extends js.Object {
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.InstanceHealthList] = js.native
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.NextToken] = js.native
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RefreshedAt] = js.native
}

object DescribeInstancesHealthResult {
  @scala.inline
  def apply(): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
  @scala.inline
  implicit class DescribeInstancesHealthResultOps[Self <: DescribeInstancesHealthResult] (val x: Self) extends AnyVal {
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
    def setInstanceHealthListVarargs(value: SingleInstanceHealth*): Self = this.set("InstanceHealthList", js.Array(value :_*))
    @scala.inline
    def setInstanceHealthList(value: InstanceHealthList): Self = this.set("InstanceHealthList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceHealthList: Self = this.set("InstanceHealthList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRefreshedAt(value: RefreshedAt): Self = this.set("RefreshedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshedAt: Self = this.set("RefreshedAt", js.undefined)
  }
  
}


package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClassicLinkInstancesResult extends js.Object {
  /**
    * Information about one or more linked EC2-Classic instances.
    */
  var Instances: js.UndefOr[ClassicLinkInstanceList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClassicLinkInstancesResult {
  @scala.inline
  def apply(): DescribeClassicLinkInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClassicLinkInstancesResult]
  }
  @scala.inline
  implicit class DescribeClassicLinkInstancesResultOps[Self <: DescribeClassicLinkInstancesResult] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: ClassicLinkInstance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: ClassicLinkInstanceList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


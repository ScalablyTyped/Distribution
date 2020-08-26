package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationResult extends js.Object {
  /**
    * The instance information list.
    */
  var InstanceInformationList: js.UndefOr[typings.awsSdk.ssmMod.InstanceInformationList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceInformationResult {
  @scala.inline
  def apply(): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
  @scala.inline
  implicit class DescribeInstanceInformationResultOps[Self <: DescribeInstanceInformationResult] (val x: Self) extends AnyVal {
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
    def setInstanceInformationListVarargs(value: InstanceInformation*): Self = this.set("InstanceInformationList", js.Array(value :_*))
    @scala.inline
    def setInstanceInformationList(value: InstanceInformationList): Self = this.set("InstanceInformationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInformationList: Self = this.set("InstanceInformationList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


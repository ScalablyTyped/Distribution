package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceAssociationsStatusResult extends js.Object {
  /**
    * Status information about the association.
    */
  var InstanceAssociationStatusInfos: js.UndefOr[typings.awsSdk.ssmMod.InstanceAssociationStatusInfos] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceAssociationsStatusResult {
  @scala.inline
  def apply(): DescribeInstanceAssociationsStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
  }
  @scala.inline
  implicit class DescribeInstanceAssociationsStatusResultOps[Self <: DescribeInstanceAssociationsStatusResult] (val x: Self) extends AnyVal {
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
    def setInstanceAssociationStatusInfosVarargs(value: InstanceAssociationStatusInfo*): Self = this.set("InstanceAssociationStatusInfos", js.Array(value :_*))
    @scala.inline
    def setInstanceAssociationStatusInfos(value: InstanceAssociationStatusInfos): Self = this.set("InstanceAssociationStatusInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceAssociationStatusInfos: Self = this.set("InstanceAssociationStatusInfos", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


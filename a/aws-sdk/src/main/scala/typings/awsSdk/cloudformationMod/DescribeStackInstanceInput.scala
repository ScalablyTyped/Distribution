package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackInstanceInput extends js.Object {
  /**
    * The ID of an AWS account that's associated with this stack instance.
    */
  var StackInstanceAccount: Account = js.native
  /**
    * The name of a Region that's associated with this stack instance.
    */
  var StackInstanceRegion: Region = js.native
  /**
    * The name or the unique stack ID of the stack set that you want to get stack instance information for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}

object DescribeStackInstanceInput {
  @scala.inline
  def apply(StackInstanceAccount: Account, StackInstanceRegion: Region, StackSetName: StackSetName): DescribeStackInstanceInput = {
    val __obj = js.Dynamic.literal(StackInstanceAccount = StackInstanceAccount.asInstanceOf[js.Any], StackInstanceRegion = StackInstanceRegion.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackInstanceInput]
  }
  @scala.inline
  implicit class DescribeStackInstanceInputOps[Self <: DescribeStackInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStackInstanceAccount(value: Account): Self = this.set("StackInstanceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackInstanceRegion(value: Region): Self = this.set("StackInstanceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackSetName(value: StackSetName): Self = this.set("StackSetName", value.asInstanceOf[js.Any])
  }
  
}


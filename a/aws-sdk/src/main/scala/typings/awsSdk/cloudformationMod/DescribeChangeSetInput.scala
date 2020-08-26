package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * A string (provided by the DescribeChangeSet response output) that identifies the next page of information that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to describe.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

object DescribeChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): DescribeChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetInput]
  }
  @scala.inline
  implicit class DescribeChangeSetInputOps[Self <: DescribeChangeSetInput] (val x: Self) extends AnyVal {
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
    def setChangeSetName(value: ChangeSetNameOrId): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
  }
  
}


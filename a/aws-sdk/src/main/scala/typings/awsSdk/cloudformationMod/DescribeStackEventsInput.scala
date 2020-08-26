package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackEventsInput extends js.Object {
  /**
    * A string that identifies the next page of events that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.native
}

object DescribeStackEventsInput {
  @scala.inline
  def apply(): DescribeStackEventsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackEventsInput]
  }
  @scala.inline
  implicit class DescribeStackEventsInputOps[Self <: DescribeStackEventsInput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
  }
  
}


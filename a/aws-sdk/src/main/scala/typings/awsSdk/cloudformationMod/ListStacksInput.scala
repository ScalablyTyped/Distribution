package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStacksInput extends js.Object {
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
    */
  var StackStatusFilter: js.UndefOr[typings.awsSdk.cloudformationMod.StackStatusFilter] = js.native
}

object ListStacksInput {
  @scala.inline
  def apply(): ListStacksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksInput]
  }
  @scala.inline
  implicit class ListStacksInputOps[Self <: ListStacksInput] (val x: Self) extends AnyVal {
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
    def setStackStatusFilterVarargs(value: StackStatus*): Self = this.set("StackStatusFilter", js.Array(value :_*))
    @scala.inline
    def setStackStatusFilter(value: StackStatusFilter): Self = this.set("StackStatusFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackStatusFilter: Self = this.set("StackStatusFilter", js.undefined)
  }
  
}


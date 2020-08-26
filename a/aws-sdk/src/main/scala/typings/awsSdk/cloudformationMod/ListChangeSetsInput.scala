package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsInput extends js.Object {
  /**
    * A string (provided by the ListChangeSets response output) that identifies the next page of change sets that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
    */
  var StackName: StackNameOrId = js.native
}

object ListChangeSetsInput {
  @scala.inline
  def apply(StackName: StackNameOrId): ListChangeSetsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsInput]
  }
  @scala.inline
  implicit class ListChangeSetsInputOps[Self <: ListChangeSetsInput] (val x: Self) extends AnyVal {
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
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


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
  def apply(StackName: StackNameOrId, NextToken: NextToken = null): ListChangeSetsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsInput]
  }
}


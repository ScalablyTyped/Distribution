package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStackSetInput extends js.Object {
  /**
    * The name or unique ID of the stack set that you're deleting. You can obtain this value by running ListStackSets.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}

object DeleteStackSetInput {
  @scala.inline
  def apply(StackSetName: StackSetName): DeleteStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteStackSetInput]
  }
}


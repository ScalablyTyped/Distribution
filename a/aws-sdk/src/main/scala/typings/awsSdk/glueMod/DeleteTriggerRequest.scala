package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTriggerRequest extends js.Object {
  /**
    * The name of the trigger to delete.
    */
  var Name: NameString = js.native
}

object DeleteTriggerRequest {
  @scala.inline
  def apply(Name: NameString): DeleteTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTriggerRequest]
  }
}


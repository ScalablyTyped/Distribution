package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotEventsAction extends js.Object {
  /**
    * The name of the AWS IoT Events input where the data is sent.
    */
  var inputName: InputName = js.native
}

object IotEventsAction {
  @scala.inline
  def apply(inputName: InputName): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IotEventsAction]
  }
}


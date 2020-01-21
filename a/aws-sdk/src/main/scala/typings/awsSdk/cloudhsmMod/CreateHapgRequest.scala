package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHapgRequest extends js.Object {
  /**
    * The label of the new high-availability partition group.
    */
  var Label: typings.awsSdk.cloudhsmMod.Label = js.native
}

object CreateHapgRequest {
  @scala.inline
  def apply(Label: Label): CreateHapgRequest = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateHapgRequest]
  }
}


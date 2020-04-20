package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexOutputSettings extends js.Object {
  /**
    * Destination is a Multiplex.
    */
  var Destination: OutputLocationRef = js.native
}

object MultiplexOutputSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): MultiplexOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexOutputSettings]
  }
}


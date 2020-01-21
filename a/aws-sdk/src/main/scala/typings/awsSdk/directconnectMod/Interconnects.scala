package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interconnects extends js.Object {
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.native
}

object Interconnects {
  @scala.inline
  def apply(interconnects: InterconnectList = null): Interconnects = {
    val __obj = js.Dynamic.literal()
    if (interconnects != null) __obj.updateDynamic("interconnects")(interconnects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interconnects]
  }
}


package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computer extends js.Object {
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.native
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.directoryserviceMod.ComputerName] = js.native
}

object Computer {
  @scala.inline
  def apply(ComputerAttributes: Attributes = null, ComputerId: SID = null, ComputerName: ComputerName = null): Computer = {
    val __obj = js.Dynamic.literal()
    if (ComputerAttributes != null) __obj.updateDynamic("ComputerAttributes")(ComputerAttributes.asInstanceOf[js.Any])
    if (ComputerId != null) __obj.updateDynamic("ComputerId")(ComputerId.asInstanceOf[js.Any])
    if (ComputerName != null) __obj.updateDynamic("ComputerName")(ComputerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computer]
  }
}


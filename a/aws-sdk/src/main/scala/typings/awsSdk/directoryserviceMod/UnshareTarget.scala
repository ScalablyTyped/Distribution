package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareTarget extends js.Object {
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId = js.native
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType = js.native
}

object UnshareTarget {
  @scala.inline
  def apply(Id: TargetId, Type: TargetType): UnshareTarget = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnshareTarget]
  }
}


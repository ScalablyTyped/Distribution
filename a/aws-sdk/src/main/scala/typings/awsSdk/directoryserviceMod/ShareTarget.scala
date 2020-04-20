package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTarget extends js.Object {
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId = js.native
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType = js.native
}

object ShareTarget {
  @scala.inline
  def apply(Id: TargetId, Type: TargetType): ShareTarget = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTarget]
  }
}


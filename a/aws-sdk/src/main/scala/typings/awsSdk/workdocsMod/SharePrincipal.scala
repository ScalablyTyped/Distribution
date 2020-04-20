package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePrincipal extends js.Object {
  /**
    * The ID of the recipient.
    */
  var Id: IdType = js.native
  /**
    * The role of the recipient.
    */
  var Role: RoleType = js.native
  /**
    * The type of the recipient.
    */
  var Type: PrincipalType = js.native
}

object SharePrincipal {
  @scala.inline
  def apply(Id: IdType, Role: RoleType, Type: PrincipalType): SharePrincipal = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePrincipal]
  }
}


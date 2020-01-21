package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  /**
    * Whether to allow or deny access to the principal.
    */
  var Access: ReadAccessType = js.native
  /**
    * The name of the user or group.
    */
  var Name: PrincipalName = js.native
  /**
    * The type of principal.
    */
  var Type: PrincipalType = js.native
}

object Principal {
  @scala.inline
  def apply(Access: ReadAccessType, Name: PrincipalName, Type: PrincipalType): Principal = {
    val __obj = js.Dynamic.literal(Access = Access.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Principal]
  }
}


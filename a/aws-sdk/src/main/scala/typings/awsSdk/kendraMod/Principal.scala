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
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess(value: ReadAccessType): Self = this.set("Access", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: PrincipalName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PrincipalType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}


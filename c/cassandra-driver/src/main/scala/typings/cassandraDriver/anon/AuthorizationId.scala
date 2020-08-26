package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationId extends js.Object {
  var authorizationId: js.UndefOr[String] = js.native
  var hostNameResolver: js.UndefOr[js.Function] = js.native
  var service: js.UndefOr[String] = js.native
}

object AuthorizationId {
  @scala.inline
  def apply(): AuthorizationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationId]
  }
  @scala.inline
  implicit class AuthorizationIdOps[Self <: AuthorizationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizationId(value: String): Self = this.set("authorizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationId: Self = this.set("authorizationId", js.undefined)
    @scala.inline
    def setHostNameResolver(value: js.Function): Self = this.set("hostNameResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostNameResolver: Self = this.set("hostNameResolver", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}


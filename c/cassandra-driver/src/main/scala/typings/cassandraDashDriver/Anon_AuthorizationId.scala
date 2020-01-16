package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationId extends js.Object {
  var authorizationId: js.UndefOr[String] = js.undefined
  var hostNameResolver: js.UndefOr[js.Function] = js.undefined
  var service: js.UndefOr[String] = js.undefined
}

object Anon_AuthorizationId {
  @scala.inline
  def apply(authorizationId: String = null, hostNameResolver: js.Function = null, service: String = null): Anon_AuthorizationId = {
    val __obj = js.Dynamic.literal()
    if (authorizationId != null) __obj.updateDynamic("authorizationId")(authorizationId.asInstanceOf[js.Any])
    if (hostNameResolver != null) __obj.updateDynamic("hostNameResolver")(hostNameResolver.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthorizationId]
  }
}


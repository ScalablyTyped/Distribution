package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamingConventionOptions extends js.Object {
  var clientPropertyNameToServer: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  var serverPropertyNameToClient: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
}

object NamingConventionOptions {
  @scala.inline
  def apply(
    clientPropertyNameToServer: /* name */ String => String = null,
    serverPropertyNameToClient: /* name */ String => String = null
  ): NamingConventionOptions = {
    val __obj = js.Dynamic.literal()
    if (clientPropertyNameToServer != null) __obj.updateDynamic("clientPropertyNameToServer")(js.Any.fromFunction1(clientPropertyNameToServer))
    if (serverPropertyNameToClient != null) __obj.updateDynamic("serverPropertyNameToClient")(js.Any.fromFunction1(serverPropertyNameToClient))
    __obj.asInstanceOf[NamingConventionOptions]
  }
}


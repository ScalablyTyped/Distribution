package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSendOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * relative url for request.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ClientSendOptions {
  @scala.inline
  def apply(sandbox: Sandbox = null, url: String = null): ClientSendOptions = {
    val __obj = js.Dynamic.literal()
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ClientSendOptions]
  }
}


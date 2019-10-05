package typings.dav.davMod

import typings.dav.davMod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCardOptions extends js.Object {
  /**
    * VCARD object.
    */
  var data: String
  /**
    * name for the vcard vcf file.
    */
  var filename: String
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object CreateCardOptions {
  @scala.inline
  def apply(data: String, filename: String, sandbox: Sandbox = null, xhr: Transport = null): CreateCardOptions = {
    val __obj = js.Dynamic.literal(data = data, filename = filename)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CreateCardOptions]
  }
}


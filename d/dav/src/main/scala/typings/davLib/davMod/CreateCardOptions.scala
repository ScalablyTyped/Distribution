package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCardOptions extends js.Object {
  /**
    * VCARD object.
    */
  var data: java.lang.String
  /**
    * name for the vcard vcf file.
    */
  var filename: java.lang.String
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[davLib.davMod.transportNs.Transport] = js.undefined
}

object CreateCardOptions {
  @scala.inline
  def apply(
    data: java.lang.String,
    filename: java.lang.String,
    sandbox: Sandbox = null,
    xhr: davLib.davMod.transportNs.Transport = null
  ): CreateCardOptions = {
    val __obj = js.Dynamic.literal(data = data, filename = filename)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CreateCardOptions]
  }
}


package typings
package crumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /**
    * The name of the cookie to store the CSRF crumb into.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override for the server's 'restful' setting
    */
  var restful: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies how the crumb will be sent in requests.
    *
    * @default 'payload'
    */
  var source: js.UndefOr[crumbLib.crumbLibStrings.payload | crumbLib.crumbLibStrings.query] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    restful: js.UndefOr[scala.Boolean] = js.undefined,
    source: crumbLib.crumbLibStrings.payload | crumbLib.crumbLibStrings.query = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(restful)) __obj.updateDynamic("restful")(restful)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}


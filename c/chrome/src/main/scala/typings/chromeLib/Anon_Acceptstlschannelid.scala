package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acceptstlschannelid extends js.Object {
  var accepts_tls_channel_id: js.UndefOr[scala.Boolean] = js.undefined
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var matches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Acceptstlschannelid {
  @scala.inline
  def apply(
    accepts_tls_channel_id: js.UndefOr[scala.Boolean] = js.undefined,
    ids: js.Array[java.lang.String] = null,
    matches: js.Array[java.lang.String] = null
  ): Anon_Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accepts_tls_channel_id)) __obj.updateDynamic("accepts_tls_channel_id")(accepts_tls_channel_id)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    __obj.asInstanceOf[Anon_Acceptstlschannelid]
  }
}


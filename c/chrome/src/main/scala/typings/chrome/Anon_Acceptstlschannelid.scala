package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acceptstlschannelid extends js.Object {
  var accepts_tls_channel_id: js.UndefOr[Boolean] = js.undefined
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  var matches: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Acceptstlschannelid {
  @scala.inline
  def apply(
    accepts_tls_channel_id: js.UndefOr[Boolean] = js.undefined,
    ids: js.Array[String] = null,
    matches: js.Array[String] = null
  ): Anon_Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accepts_tls_channel_id)) __obj.updateDynamic("accepts_tls_channel_id")(accepts_tls_channel_id.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Acceptstlschannelid]
  }
}


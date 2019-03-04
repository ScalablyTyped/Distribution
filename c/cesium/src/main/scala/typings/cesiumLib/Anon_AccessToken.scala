package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var assetId: scala.Double
  var server: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccessToken {
  @scala.inline
  def apply(assetId: scala.Double, accessToken: java.lang.String = null, server: java.lang.String = null): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(assetId = assetId)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_AccessToken]
  }
}


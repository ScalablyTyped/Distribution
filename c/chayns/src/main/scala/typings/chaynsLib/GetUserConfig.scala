package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns
  * interfaces
  */
// chayns.getUser()
trait GetUserConfig extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var fbId: js.UndefOr[java.lang.String] = js.undefined
  var personId: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[scala.Double] = js.undefined
}

object GetUserConfig {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    fbId: java.lang.String = null,
    personId: java.lang.String = null,
    userId: scala.Int | scala.Double = null
  ): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (fbId != null) __obj.updateDynamic("fbId")(fbId)
    if (personId != null) __obj.updateDynamic("personId")(personId)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserConfig]
  }
}


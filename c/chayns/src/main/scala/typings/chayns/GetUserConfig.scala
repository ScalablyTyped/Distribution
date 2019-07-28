package typings.chayns

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
  var accessToken: js.UndefOr[String] = js.undefined
  var fbId: js.UndefOr[String] = js.undefined
  var personId: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[Double] = js.undefined
}

object GetUserConfig {
  @scala.inline
  def apply(
    accessToken: String = null,
    fbId: String = null,
    personId: String = null,
    userId: Int | Double = null
  ): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (fbId != null) __obj.updateDynamic("fbId")(fbId)
    if (personId != null) __obj.updateDynamic("personId")(personId)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserConfig]
  }
}


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
    userId: js.UndefOr[Double] = js.undefined
  ): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (fbId != null) __obj.updateDynamic("fbId")(fbId.asInstanceOf[js.Any])
    if (personId != null) __obj.updateDynamic("personId")(personId.asInstanceOf[js.Any])
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserConfig]
  }
}


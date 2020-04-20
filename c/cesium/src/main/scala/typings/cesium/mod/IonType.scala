package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonType extends js.Object {
  var defaultAccessToken: String
  var defaultServer: String | Resource
  def getDefaultTokenCredit(providedKey: String): Credit
}

object IonType {
  @scala.inline
  def apply(
    defaultAccessToken: String,
    defaultServer: String | Resource,
    getDefaultTokenCredit: String => Credit
  ): IonType = {
    val __obj = js.Dynamic.literal(defaultAccessToken = defaultAccessToken.asInstanceOf[js.Any], defaultServer = defaultServer.asInstanceOf[js.Any], getDefaultTokenCredit = js.Any.fromFunction1(getDefaultTokenCredit))
    __obj.asInstanceOf[IonType]
  }
}


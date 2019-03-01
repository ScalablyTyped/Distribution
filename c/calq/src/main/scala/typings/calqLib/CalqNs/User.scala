package typings
package calqLib.CalqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  def clear(): scala.Unit
  def identify(userId: java.lang.String): scala.Unit
  def profile(params: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit
}

object User {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    identify: js.Function1[java.lang.String, scala.Unit],
    profile: js.Function1[org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
  ): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("identify")(identify)
    __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[User]
  }
}


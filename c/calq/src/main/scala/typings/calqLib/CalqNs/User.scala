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
    clear: () => scala.Unit,
    identify: java.lang.String => scala.Unit,
    profile: org.scalablytyped.runtime.StringDictionary[js.Any] => scala.Unit
  ): User = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), identify = js.Any.fromFunction1(identify), profile = js.Any.fromFunction1(profile))
  
    __obj.asInstanceOf[User]
  }
}


package typings.calq.Calq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  def clear(): Unit
  def identify(userId: String): Unit
  def profile(params: StringDictionary[js.Any]): Unit
}

object User {
  @scala.inline
  def apply(clear: () => Unit, identify: String => Unit, profile: StringDictionary[js.Any] => Unit): User = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), identify = js.Any.fromFunction1(identify), profile = js.Any.fromFunction1(profile))
  
    __obj.asInstanceOf[User]
  }
}


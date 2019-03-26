package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain
  * object is, in other words, an Object object. It is designated "plain" in jQuery documentation to
  * distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and
  * host objects such as document, all of which have a typeof value of "object."
  */
trait PlainObject[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object PlainObject {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): PlainObject[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PlainObject[T]]
  }
}


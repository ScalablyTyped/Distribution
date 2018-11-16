package typings
package cookieLib.cookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie", JSImport.Namespace)
@js.native
object cookieModMembers extends js.Object {
  def parse(str: java.lang.String): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def parse(str: java.lang.String, options: CookieParseOptions): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def serialize(name: java.lang.String, `val`: java.lang.String): java.lang.String = js.native
  def serialize(name: java.lang.String, `val`: java.lang.String, options: CookieSerializeOptions): java.lang.String = js.native
}


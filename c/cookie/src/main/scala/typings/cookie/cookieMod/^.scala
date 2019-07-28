package typings.cookie.cookieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(str: String): StringDictionary[String] = js.native
  def parse(str: String, options: CookieParseOptions): StringDictionary[String] = js.native
  def serialize(name: String, `val`: String): String = js.native
  def serialize(name: String, `val`: String, options: CookieSerializeOptions): String = js.native
}


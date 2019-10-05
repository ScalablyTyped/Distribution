package typings.cookieUnderscoreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cookie")
@js.native
object cookie extends js.Object {
  var defaults: Options = js.native
  var utils: UtilStatic = js.native
  def apply(key: String): String = js.native
  def apply(key: String, fallback: String): String = js.native
  def apply(keys: js.Array[String]): String = js.native
  def apply(keys: js.Array[String], fallback: String): String = js.native
  def all(): js.Any = js.native
  def empty(): Unit = js.native
  def enabled(): Boolean = js.native
  def get(key: String): String = js.native
  def get(key: String, fallback: String): String = js.native
  def get(keys: js.Array[String]): js.Any = js.native
  def get(keys: js.Array[String], fallback: String): js.Any = js.native
  def remove(args: String*): Unit = js.native
  def remove(key: String): Unit = js.native
  def remove(keys: js.Array[String]): Unit = js.native
  def removeSpecific(key: String): Unit = js.native
  def removeSpecific(key: String, options: js.Any): Unit = js.native
  def removeSpecific(keys: js.Array[String]): Unit = js.native
  def removeSpecific(keys: js.Array[String], options: js.Any): Unit = js.native
  def set(key: String, value: String): Unit = js.native
  def set(key: String, value: String, options: js.Any): Unit = js.native
  def set(obj: js.Any): Unit = js.native
  def set(obj: js.Any, options: js.Any): Unit = js.native
}


package typings
package cookieUnderscoreJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * https://github.com/DefinitelyTyped/DefinitelyTyped/pull/16025#issuecomment-295784660
 */
@JSImport("cookiejs", JSImport.Namespace)
@js.native
object cookiejsMod extends js.Object {
  var defaults: cookieUnderscoreJsLib.Options = js.native
  var utils: cookieUnderscoreJsLib.UtilStatic = js.native
  def apply(key: java.lang.String): java.lang.String = js.native
  def apply(key: java.lang.String, fallback: java.lang.String): java.lang.String = js.native
  def apply(keys: js.Array[java.lang.String]): java.lang.String = js.native
  def apply(keys: js.Array[java.lang.String], fallback: java.lang.String): java.lang.String = js.native
  def all(): js.Any = js.native
  def empty(): scala.Unit = js.native
  def enabled(): scala.Boolean = js.native
  def get(key: java.lang.String): java.lang.String = js.native
  def get(key: java.lang.String, fallback: java.lang.String): java.lang.String = js.native
  def get(keys: js.Array[java.lang.String]): js.Any = js.native
  def get(keys: js.Array[java.lang.String], fallback: java.lang.String): js.Any = js.native
  def remove(args: java.lang.String*): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def removeSpecific(key: java.lang.String): scala.Unit = js.native
  def removeSpecific(key: java.lang.String, options: js.Any): scala.Unit = js.native
  def removeSpecific(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def removeSpecific(keys: js.Array[java.lang.String], options: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: java.lang.String, options: js.Any): scala.Unit = js.native
  def set(obj: js.Any): scala.Unit = js.native
  def set(obj: js.Any, options: js.Any): scala.Unit = js.native
}


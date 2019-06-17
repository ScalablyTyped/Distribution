package typings
package coreDashJsLib.shimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/shim", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Dict: coreDashJsLib.DictConstructor = js.native
  val Map: stdLib.MapConstructor = js.native
  val Promise: stdLib.PromiseConstructor = js.native
  val Set: stdLib.SetConstructor = js.native
  val WeakMap: stdLib.WeakMapConstructor = js.native
  val WeakSet: stdLib.WeakSetConstructor = js.native
  val `_`: scala.Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: stdLib.Iterable[T]): coreDashJsLib.$for[T] = js.native
  def addLocale(lang: java.lang.String, locale: coreDashJsLib.coreNs.Locale): coreDashJsLib.Typeofcore = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
  def getIterator[T](iterable: stdLib.Iterable[T]): stdLib.Iterator[T] = js.native
  def isIterable(value: js.Any): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
}


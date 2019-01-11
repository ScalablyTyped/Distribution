package typings
package coreDashJsLib.libraryCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Array: coreDashJsLib.Anon_A = js.native
  val Date: coreDashJsLib.Anon_Date = js.native
  val Dict: coreDashJsLib.DictConstructor = js.native
  val Function: coreDashJsLib.Anon_ArgArray = js.native
  val Map: nodeLib.MapConstructor = js.native
  val Math: coreDashJsLib.Anon_AcoshAsinh = js.native
  val Number: coreDashJsLib.Anon_Acosh = js.native
  val Object: coreDashJsLib.Anon_Assign = js.native
  val Promise: stdLib.PromiseConstructor = js.native
  val RegExp: coreDashJsLib.Anon_Escape = js.native
  val Set: nodeLib.SetConstructor = js.native
  val String: coreDashJsLib.Anon_At = js.native
  val WeakMap: nodeLib.WeakMapConstructor = js.native
  val WeakSet: nodeLib.WeakSetConstructor = js.native
  val `_`: scala.Boolean = js.native
  val global: js.Any = js.native
  val log: coreDashJsLib.Log = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T]): coreDashJsLib.$for[T] = js.native
  def addLocale(lang: java.lang.String, locale: coreDashJsLib.coreNs.Locale): coreDashJsLib.`Anon_` = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
  def getIterator[T](iterable: nodeLib.Iterable[T]): nodeLib.Iterator[T] = js.native
  def isIterable(value: js.Any): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
}


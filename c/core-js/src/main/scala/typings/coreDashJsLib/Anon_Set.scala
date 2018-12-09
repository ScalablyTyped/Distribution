package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Set extends js.Object {
  val Array: Anon_Find = js.native
  val Date: Anon_Now = js.native
  val Dict: DictConstructor = js.native
  val Function: Anon_Part = js.native
  val Map: nodeLib.MapConstructor = js.native
  val Math: Anon_Log2 = js.native
  val Number: Anon_Random = js.native
  val Object: Anon_GetOwnPropertyDescriptors = js.native
  val Promise: stdLib.PromiseConstructor = js.native
  val RegExp: Anon_Escape = js.native
  val Set: nodeLib.SetConstructor = js.native
  val String: Anon_PadEnd = js.native
  val Symbol: SymbolConstructor = js.native
  val WeakMap: nodeLib.WeakMapConstructor = js.native
  val WeakSet: nodeLib.WeakSetConstructor = js.native
  val `_`: scala.Boolean = js.native
  val global: js.Any = js.native
  val log: Log = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T]): $for[T] = js.native
  def addLocale(lang: java.lang.String, locale: coreDashJsLib.coreNs.Locale): /* import warning: Failed type conversion: TsTypeQuery(TsQIdent(List(TsIdentLibrarySimple(core-js), TsIdentNamespace(core)))) */js.Any = js.native
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


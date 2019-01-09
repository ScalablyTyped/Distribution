package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `Anon_` extends js.Object {
  val Array: Anon_A = js.native
  val Date: Anon_Date = js.native
  @JSName("Dict")
  val Dict_Original: DictConstructor = js.native
  val Function: Anon_ArgArray = js.native
  val Map: nodeLib.MapConstructor = js.native
  val Math: Anon_AcoshAsinh = js.native
  val Number: Anon_Acosh = js.native
  val Object: Anon_Assign = js.native
  val Promise: stdLib.PromiseConstructor = js.native
  val ReflectNs: Anon_Apply = js.native
  val RegExp: Anon_Escape = js.native
  val Set: nodeLib.SetConstructor = js.native
  val String: Anon_At = js.native
  val Symbol: SymbolConstructor = js.native
  val WeakMap: nodeLib.WeakMapConstructor = js.native
  val WeakSet: nodeLib.WeakSetConstructor = js.native
  val `_`: scala.Boolean = js.native
  val global: js.Any = js.native
  @JSName("log")
  val log_Original: Log = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: nodeLib.Iterable[T]): $for[T] = js.native
  def Dict(): Dict[_] = js.native
  def Dict(value: js.Any): Dict[_] = js.native
  def Dict[T](value: Dict[T]): Dict[T] = js.native
  @JSName("Dict")
  def Dict_T[T](): Dict[T] = js.native
  def addLocale(lang: java.lang.String, locale: coreDashJsLib.coreNs.Locale): /* import warning: ImportType.apply Failed type conversion: typeof core */ js.Any = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
  def getIterator[T](iterable: nodeLib.Iterable[T]): nodeLib.Iterator[T] = js.native
  def isIterable(value: js.Any): scala.Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def setImmediate(expression: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
}


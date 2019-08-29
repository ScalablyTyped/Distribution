package typings.coreDashJs.libraryMod

import typings.coreDashJs.DictConstructor
import typings.coreDashJs.Typeofcore
import typings.coreDashJs.coreNs.Locale
import typings.std.Iterable
import typings.std.Iterator
import typings.std.MapConstructor
import typings.std.PromiseConstructor
import typings.std.SetConstructor
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Dict: DictConstructor = js.native
  val Map: MapConstructor = js.native
  val Promise: PromiseConstructor = js.native
  val Set: SetConstructor = js.native
  val WeakMap: WeakMapConstructor = js.native
  val WeakSet: WeakSetConstructor = js.native
  val `_`: Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: Iterable[T]): typings.coreDashJs.$for[T] = js.native
  def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  def getIterator[T](iterable: Iterable[T]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def isIterable(value: js.Any): Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Any): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
}


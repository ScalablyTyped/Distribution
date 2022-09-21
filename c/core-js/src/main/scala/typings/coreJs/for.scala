package typings.coreJs

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `for`[T]
  extends StObject
     with IterableIterator[T] {
  
  def array(): Array[T] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ Any, U]): Array[U] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ Any, U], thisArg: Any): Array[U] = js.native
  
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ Any, Boolean]): `for`[T] = js.native
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ Any, Boolean], thisArg: Any): `for`[T] = js.native
  
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ Any, U]): `for`[U] = js.native
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ Any, U], thisArg: Any): `for`[U] = js.native
  
  def of(callbackfn: js.Function2[/* value */ T, /* key */ Any, Unit]): Unit = js.native
  def of(callbackfn: js.Function2[/* value */ T, /* key */ Any, Unit], thisArg: Any): Unit = js.native
}

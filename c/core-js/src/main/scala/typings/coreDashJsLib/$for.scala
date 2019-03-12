package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $for[T]
  extends stdLib.IterableIterator[T] {
  def array(): Array[T] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U]): Array[U] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U], thisArg: js.Any): Array[U] = js.native
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, scala.Boolean]): $for[T] = js.native
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, scala.Boolean], thisArg: js.Any): $for[T] = js.native
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U]): $for[U] = js.native
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U], thisArg: js.Any): $for[U] = js.native
  def of(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, scala.Unit]): scala.Unit = js.native
  def of(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, scala.Unit], thisArg: js.Any): scala.Unit = js.native
}


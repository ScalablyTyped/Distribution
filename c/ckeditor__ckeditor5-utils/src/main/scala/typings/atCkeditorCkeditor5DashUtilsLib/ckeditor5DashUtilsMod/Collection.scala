package typings
package atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "Collection")
@js.native
class Collection[T] ()
  extends stdLib.Iterable[T]
     with Emitter {
  def this(options: atCkeditorCkeditor5DashUtilsLib.Anon_IdProperty[T]) = this()
  var first: T | scala.Null = js.native
  /* CompleteClass */
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[T]] = js.native
  var last: T | scala.Null = js.native
  var length: scala.Double = js.native
  def add(item: T): this.type = js.native
  def add(item: T, index: scala.Double): this.type = js.native
  def bindTo[S](externalCollection: Collection[S]): CollectionBindTo[S, T] = js.native
  def clear(): scala.Unit = js.native
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): js.Array[T] = js.native
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean], thisArg: js.Any): js.Array[T] = js.native
  def find(predicate: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]): js.UndefOr[T] = js.native
  def find(predicate: js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean], thisArg: js.Any): js.UndefOr[T] = js.native
  def get(idOrIndex: java.lang.String): T | scala.Null = js.native
  def get(idOrIndex: scala.Double): T | scala.Null = js.native
  def getIndex(idOrItem: T): scala.Double = js.native
  def getIndex(idOrItem: java.lang.String): scala.Double = js.native
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ scala.Double, U]): js.Array[U] = js.native
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ scala.Double, U], thisArg: js.Any): js.Array[U] = js.native
  def remove(subject: T): T = js.native
  def remove(subject: java.lang.String): T = js.native
  def remove(subject: scala.Double): T = js.native
}


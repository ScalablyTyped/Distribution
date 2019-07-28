package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.atCkeditorCkeditor5DashUtils.Anon_IdProperty
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "Collection")
@js.native
class Collection[T] ()
  extends Iterable[T]
     with Emitter {
  def this(options: Anon_IdProperty[T]) = this()
  var first: T | Null = js.native
  var last: T | Null = js.native
  var length: Double = js.native
  def add(item: T): this.type = js.native
  def add(item: T, index: Double): this.type = js.native
  def bindTo[S](externalCollection: Collection[S]): CollectionBindTo[S, T] = js.native
  def clear(): Unit = js.native
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
  def filter(callbackfn: js.Function2[/* item */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Array[T] = js.native
  def find(predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def find(predicate: js.Function2[/* item */ T, /* index */ Double, Boolean], thisArg: js.Any): js.UndefOr[T] = js.native
  def get(idOrIndex: String): T | Null = js.native
  def get(idOrIndex: Double): T | Null = js.native
  def getIndex(idOrItem: T): Double = js.native
  def getIndex(idOrItem: String): Double = js.native
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = js.native
  def map[U](callbackfn: js.Function2[/* item */ T, /* index */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  def remove(subject: T): T = js.native
  def remove(subject: String): T = js.native
  def remove(subject: Double): T = js.native
}


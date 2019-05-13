package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Collection")
@js.native
class Collection[T /* <: Model[_] */] () extends CollectionBase[T] {
  def attach(ids: js.Any): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def attach(ids: js.Any, options: SyncOptions): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def attach(ids: js.Array[_]): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def attach(ids: js.Array[_], options: SyncOptions): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def count(): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def count(column: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def count(column: java.lang.String, options: SyncOptions): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def create(model: org.scalablytyped.runtime.StringDictionary[js.Any]): bluebirdLib.bluebirdMod.^[T] = js.native
  def create(model: org.scalablytyped.runtime.StringDictionary[js.Any], options: CollectionCreateOptions): bluebirdLib.bluebirdMod.^[T] = js.native
  def detach(): bluebirdLib.bluebirdMod.^[_] = js.native
  def detach(ids: js.Array[_]): bluebirdLib.bluebirdMod.^[_] = js.native
  def detach(ids: js.Array[_], options: SyncOptions): bluebirdLib.bluebirdMod.^[_] = js.native
  def detach(options: SyncOptions): bluebirdLib.bluebirdMod.^[_] = js.native
  def fetchOne(): bluebirdLib.bluebirdMod.^[T] = js.native
  def fetchOne(options: CollectionFetchOneOptions): bluebirdLib.bluebirdMod.^[T] = js.native
  def load(relations: java.lang.String): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def load(relations: java.lang.String, options: SyncOptions): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def load(relations: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def load(relations: js.Array[java.lang.String], options: SyncOptions): bluebirdLib.bluebirdMod.^[Collection[T]] = js.native
  def orderBy(column: java.lang.String): Collection[T] = js.native
  def orderBy(column: java.lang.String, order: SortOrder): Collection[T] = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): knexLib.knexMod.QueryBuilder[_, js.Array[stdLib.Partial[_]]] = js.native
  def query(
    callback: js.Function1[/* qb */ knexLib.knexMod.QueryBuilder[_, js.Array[stdLib.Partial[_]]], scala.Unit]
  ): Collection[T] = js.native
  def query(query: java.lang.String*): Collection[T] = js.native
  def query(query: org.scalablytyped.runtime.StringDictionary[js.Any]): Collection[T] = js.native
  def resetQuery(): Collection[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String, otherKey: java.lang.String): Collection[R] = js.native
  def updatePivot(attributes: js.Any): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def updatePivot(attributes: js.Any, options: PivotOptions): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def withPivot(columns: js.Array[java.lang.String]): Collection[T] = js.native
}

/* static members */
@JSImport("bookshelf", "Collection")
@js.native
object Collection extends js.Object {
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/collection.js#L389
  var EmptyError: createDashErrorLib.createDashErrorMod.Error[stdLib.Error] = js.native
  /** @deprecated use Typescript classes */
  def extend[T](): js.Function = js.native
  def extend[T](prototypeProperties: js.Any): js.Function = js.native
  def extend[T](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  def forge[T](attributes: js.Any): T = js.native
  def forge[T](attributes: js.Any, options: bookshelfLib.bookshelfMod.ModelOptions): T = js.native
}


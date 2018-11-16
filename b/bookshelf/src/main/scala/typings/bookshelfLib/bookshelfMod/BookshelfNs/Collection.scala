package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T /* <: Model[_] */] extends CollectionBase[T] {
  def attach(ids: js.Any): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def attach(ids: js.Any, options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def attach(ids: js.Array[_]): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def attach(ids: js.Array[_], options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def count(): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String, options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def create(model: ScalablyTyped.runtime.StringDictionary[js.Any]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def create(model: ScalablyTyped.runtime.StringDictionary[js.Any], options: CollectionCreateOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def detach(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def detach(ids: js.Array[_]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def detach(ids: js.Array[_], options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def detach(options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def fetchOne(): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def fetchOne(options: CollectionFetchOneOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def load(relations: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def load(relations: java.lang.String, options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def load(relations: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def load(relations: js.Array[java.lang.String], options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def orderBy(column: java.lang.String): Collection[T] = js.native
  def orderBy(column: java.lang.String, order: SortOrder): Collection[T] = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def query(callback: js.Function1[/* qb */ knexLib.knexMod.KnexNs.QueryBuilder, scala.Unit]): Collection[T] = js.native
  def query(query: ScalablyTyped.runtime.StringDictionary[js.Any]): Collection[T] = js.native
  def query(query: java.lang.String*): Collection[T] = js.native
  def resetQuery(): Collection[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String): Collection[R] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String, otherKey: java.lang.String): Collection[R] = js.native
  def updatePivot(attributes: js.Any): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def updatePivot(attributes: js.Any, options: PivotOptions): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def withPivot(columns: js.Array[java.lang.String]): Collection[T] = js.native
}


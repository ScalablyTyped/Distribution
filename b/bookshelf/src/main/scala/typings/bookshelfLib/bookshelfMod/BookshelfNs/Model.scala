package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model[T /* <: Model[_] */] extends ModelBase[T] {
  def belongsTo[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): R = js.native
  def belongsTo[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], foreignKey: java.lang.String): R = js.native
  def belongsTo[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    foreignKey: java.lang.String,
    foreignKeyTarget: java.lang.String
  ): R = js.native
  def belongsToMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], table: java.lang.String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], table: java.lang.String, foreignKey: java.lang.String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    table: java.lang.String,
    foreignKey: java.lang.String,
    otherKey: java.lang.String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    table: java.lang.String,
    foreignKey: java.lang.String,
    otherKey: java.lang.String,
    foreignKeyTarget: java.lang.String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    table: java.lang.String,
    foreignKey: java.lang.String,
    otherKey: java.lang.String,
    foreignKeyTarget: java.lang.String,
    otherKeyTarget: java.lang.String
  ): Collection[R] = js.native
  def count(): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String, options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def destroy(): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def destroy(options: DestroyOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def fetch(): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def fetch(options: FetchOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def fetchAll(): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def fetchAll(options: FetchAllOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def hasMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], foreignKey: java.lang.String): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    foreignKey: java.lang.String,
    foreignKeyTarget: java.lang.String
  ): Collection[R] = js.native
  def hasOne[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): R = js.native
  def hasOne[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], foreignKey: java.lang.String): R = js.native
  def hasOne[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    foreignKey: java.lang.String,
    foreignKeyTarget: java.lang.String
  ): R = js.native
  def load(relations: java.lang.String): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def load(relations: java.lang.String, options: LoadOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def load(relations: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def load(relations: js.Array[java.lang.String], options: LoadOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def morphMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], name: java.lang.String): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], name: java.lang.String, columnNames: js.Array[java.lang.String]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    name: java.lang.String,
    columnNames: js.Array[java.lang.String],
    morphValue: java.lang.String
  ): Collection[R] = js.native
  def morphOne[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R]): R = js.native
  def morphOne[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], name: java.lang.String): R = js.native
  def morphOne[R /* <: Model[_] */](target: bookshelfLib.Anon_Args[R], name: java.lang.String, columnNames: js.Array[java.lang.String]): R = js.native
  def morphOne[R /* <: Model[_] */](
    target: bookshelfLib.Anon_Args[R],
    name: java.lang.String,
    columnNames: js.Array[java.lang.String],
    morphValue: java.lang.String
  ): R = js.native
  def morphTo(name: java.lang.String): T = js.native
  def morphTo(name: java.lang.String, columnNames: js.Array[java.lang.String], target: ModelSubclass*): T = js.native
  def morphTo(name: java.lang.String, target: ModelSubclass*): T = js.native
  def orderBy(column: java.lang.String): T = js.native
  def orderBy(column: java.lang.String, order: SortOrder): T = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def query(callback: js.Function1[/* qb */ knexLib.knexMod.KnexNs.QueryBuilder, scala.Unit]): T = js.native
  def query(query: java.lang.String*): T = js.native
  def query(query: org.scalablytyped.runtime.StringDictionary[js.Any]): T = js.native
  def refresh(): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def refresh(options: FetchOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def resetQuery(): T = js.native
  def save(): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def save(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def save(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], options: SaveOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def save(key: java.lang.String): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def save(key: java.lang.String, `val`: js.Any): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def save(key: java.lang.String, `val`: js.Any, options: SaveOptions): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: java.lang.String, otherKey: java.lang.String): R = js.native
  def where(key: java.lang.String, operatorOrValue: java.lang.String): T = js.native
  def where(key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: java.lang.String): T = js.native
  def where(
    key: java.lang.String,
    operatorOrValue: java.lang.String,
    valueIfOperator: js.Array[scala.Double | java.lang.String]
  ): T = js.native
  def where(key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: scala.Boolean): T = js.native
  def where(key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: scala.Double): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Boolean): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: java.lang.String): T = js.native
  def where(
    key: java.lang.String,
    operatorOrValue: scala.Boolean,
    valueIfOperator: js.Array[scala.Double | java.lang.String]
  ): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: scala.Boolean): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: scala.Double): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Double): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: java.lang.String): T = js.native
  def where(
    key: java.lang.String,
    operatorOrValue: scala.Double,
    valueIfOperator: js.Array[scala.Double | java.lang.String]
  ): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: scala.Boolean): T = js.native
  def where(key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: scala.Double): T = js.native
  def where(properties: org.scalablytyped.runtime.StringDictionary[js.Any]): T = js.native
}


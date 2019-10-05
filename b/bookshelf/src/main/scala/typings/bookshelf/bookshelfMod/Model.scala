package typings.bookshelf.bookshelfMod

import org.scalablytyped.runtime.StringDictionary
import typings.bluebird.bluebirdMod.^
import typings.bookshelf.Anon_Args
import typings.knex.knexMod.QueryBuilder
import typings.knex.knexMod.SafePartial
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Model")
@js.native
class Model[T /* <: Model[_] */] () extends ModelBase[T] {
  def belongsTo[R /* <: Model[_] */](target: Anon_Args[R]): R = js.native
  def belongsTo[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String): R = js.native
  def belongsTo[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def belongsToMany[R /* <: Model[_] */](target: Anon_Args[R]): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Anon_Args[R], table: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Anon_Args[R], table: String, foreignKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](target: Anon_Args[R], table: String, foreignKey: String, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: Anon_Args[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[_] */](
    target: Anon_Args[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def count(): ^[Double | String] = js.native
  def count(column: String): ^[Double | String] = js.native
  def count(column: String, options: SyncOptions): ^[Double | String] = js.native
  def destroy(): ^[T] = js.native
  def destroy(options: DestroyOptions): ^[T] = js.native
  def fetch(): ^[T] = js.native
  def fetch(options: FetchOptions): ^[T] = js.native
  def fetchAll(): ^[Collection[T]] = js.native
  def fetchAll(options: FetchAllOptions): ^[Collection[T]] = js.native
  def hasMany[R /* <: Model[_] */](target: Anon_Args[R]): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String): Collection[R] = js.native
  def hasMany[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String, foreignKeyTarget: String): Collection[R] = js.native
  def hasOne[R /* <: Model[_] */](target: Anon_Args[R]): R = js.native
  def hasOne[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String): R = js.native
  def hasOne[R /* <: Model[_] */](target: Anon_Args[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def load(relations: String): ^[T] = js.native
  def load(relations: String, options: LoadOptions): ^[T] = js.native
  def load(relations: js.Array[String]): ^[T] = js.native
  def load(relations: js.Array[String], options: LoadOptions): ^[T] = js.native
  def morphMany[R /* <: Model[_] */](target: Anon_Args[R]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Anon_Args[R], name: String): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Anon_Args[R], name: String, columnNames: js.Array[String]): Collection[R] = js.native
  def morphMany[R /* <: Model[_] */](target: Anon_Args[R], name: String, columnNames: js.Array[String], morphValue: String): Collection[R] = js.native
  def morphOne[R /* <: Model[_] */](target: Anon_Args[R]): R = js.native
  def morphOne[R /* <: Model[_] */](target: Anon_Args[R], name: String): R = js.native
  def morphOne[R /* <: Model[_] */](target: Anon_Args[R], name: String, columnNames: js.Array[String]): R = js.native
  def morphOne[R /* <: Model[_] */](target: Anon_Args[R], name: String, columnNames: js.Array[String], morphValue: String): R = js.native
  def morphTo(name: String): T = js.native
  def morphTo(name: String, columnNames: js.Array[String], target: ModelSubclass*): T = js.native
  def morphTo(name: String, target: ModelSubclass*): T = js.native
  def orderBy(column: String): T = js.native
  def orderBy(column: String, order: SortOrder): T = js.native
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def query(callback: js.Function1[/* qb */ QueryBuilder[_, js.Array[SafePartial[_]]], Unit]): T = js.native
  def query(query: String*): T = js.native
  def query(query: StringDictionary[js.Any]): T = js.native
  def refresh(): ^[T] = js.native
  def refresh(options: FetchOptions): ^[T] = js.native
  def resetQuery(): T = js.native
  def save(): ^[T] = js.native
  def save(attrs: StringDictionary[js.Any]): ^[T] = js.native
  def save(attrs: StringDictionary[js.Any], options: SaveOptions): ^[T] = js.native
  def save(key: String): ^[T] = js.native
  def save(key: String, `val`: js.Any): ^[T] = js.native
  def save(key: String, `val`: js.Any, options: SaveOptions): ^[T] = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String): R = js.native
  def through[R /* <: Model[_] */](interim: ModelSubclass, throughForeignKey: String, otherKey: String): R = js.native
  def where(key: String, operatorOrValue: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Double): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Double): T = js.native
  def where(properties: StringDictionary[js.Any]): T = js.native
}

/* static members */
@JSImport("bookshelf", "Model")
@js.native
object Model extends js.Object {
  var NoRowsDeletedError: typings.createDashError.createDashErrorMod.Error[Error] = js.native
  var NoRowsUpdatedError: typings.createDashError.createDashErrorMod.Error[Error] = js.native
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/errors.js
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/model.js#L1280
  var NotFoundError: typings.createDashError.createDashErrorMod.Error[Error] = js.native
  def collection[T /* <: Model[_] */](): Collection[T] = js.native
  def collection[T /* <: Model[_] */](models: js.Array[T]): Collection[T] = js.native
  def collection[T /* <: Model[_] */](models: js.Array[T], options: CollectionOptions[T]): Collection[T] = js.native
  def count(): ^[Double | String] = js.native
  def count(column: String): ^[Double | String] = js.native
  def count(column: String, options: SyncOptions): ^[Double | String] = js.native
  /** @deprecated use Typescript classes */
  def extend[T /* <: Model[_] */](): js.Function = js.native
  def extend[T /* <: Model[_] */](prototypeProperties: js.Any): js.Function = js.native
  def extend[T /* <: Model[_] */](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
   // should return a type
  def fetchAll[T /* <: Model[_] */](): ^[Collection[T]] = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  def forge[T](attributes: js.Any): T = js.native
  def forge[T](attributes: js.Any, options: ModelOptions): T = js.native
  def where[T](key: String, operatorOrValue: String): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: String, valueIfOperator: Double): T = js.native
  def where[T](key: String, operatorOrValue: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = js.native
  def where[T](key: String, operatorOrValue: Double): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: String): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = js.native
  def where[T](key: String, operatorOrValue: Double, valueIfOperator: Double): T = js.native
  def where[T](properties: StringDictionary[js.Any]): T = js.native
}


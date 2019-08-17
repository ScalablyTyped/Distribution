package typings.cassanknex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassanknexMod {
  import org.scalablytyped.runtime.StringDictionary

  type AlterColumnFamilyQueryBuilder[T] = QueryBuilder with AlterableQueryBuilder[T] with FieldValueQueryBuilder[T]
  type CreateColumnFamilyQueryBuilder[T] = QueryBuilder with FieldValueQueryBuilder[T] with CreateableColumnFamilyBuilder[T]
  type CreateTypeQueryBuilder[T] = QueryBuilder with FieldValueQueryBuilder[T]
  type DeleteQueryBuilder[T] = QueryBuilder with WhereableQueryBuilder[T] with FromableQueryBuilder
  type InsertQueryBuilder = QueryBuilder with InsertableQueryBuilder with TtlableQueryBuilder
  type KeyspaceQueryBuilder = QueryBuilder with KeyspaceableQueryBuilder
  type MappedDict[B] = StringDictionary[B]
  type SelectAsClause[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.cassanknex.cassanknexStrings.SelectAsClause with js.Any
  type SelectQueryBuilder[T] = QueryBuilder with WhereableQueryBuilder[T] with LimitableQueryBuilder with FromableQueryBuilder
  /**
    * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
    */
  type TypeMatchedValue[T, K /* <: String */, Type, This] = This
  type UpdateQueryBuilder[T] = QueryBuilder with WhereableQueryBuilder[T] with UpdateableQueryBuilder[T] with IfableQueryBuilder[T] with TtlableQueryBuilder
}

package typings.cassanknex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlterColumnFamilyQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.AlterableQueryBuilder[T] with typings.cassanknex.mod.FieldValueQueryBuilder[T]
  type CreateColumnFamilyQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.FieldValueQueryBuilder[T] with typings.cassanknex.mod.CreateableColumnFamilyBuilder[T]
  type CreateTypeQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.FieldValueQueryBuilder[T]
  type DeleteQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.FromableQueryBuilder
  type InsertQueryBuilder = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.InsertableQueryBuilder with typings.cassanknex.mod.TtlableQueryBuilder
  type KeyspaceQueryBuilder = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.KeyspaceableQueryBuilder
  type MappedDict[B] = org.scalablytyped.runtime.StringDictionary[B]
  type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.cassanknex.cassanknexStrings.SelectAsClause with js.Any
  type SelectQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.LimitableQueryBuilder with typings.cassanknex.mod.FromableQueryBuilder
  /**
    * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
    */
  type TypeMatchedValue[T, K /* <: java.lang.String */, Type, This] = This
  type UpdateQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.UpdateableQueryBuilder[T] with typings.cassanknex.mod.IfableQueryBuilder[T] with typings.cassanknex.mod.TtlableQueryBuilder
}

package typings.cassanknex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typings.cassanknex.mod.CassanKnex = typings.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.cassanknex.mod.CassanKnex]
  @scala.inline
  def apply(options: typings.cassanknex.mod.DriverOptions): typings.cassanknex.mod.CassanKnex = typings.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.cassanknex.mod.CassanKnex]
  
  type AlterColumnFamilyQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.AlterableQueryBuilder[T] with typings.cassanknex.mod.FieldValueQueryBuilder[T]
  
  type CreateColumnFamilyQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.FieldValueQueryBuilder[T] with typings.cassanknex.mod.CreateableColumnFamilyBuilder[T]
  
  type CreateTypeQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.FieldValueQueryBuilder[T]
  
  type DeleteQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.FromableQueryBuilder
  
  type InsertQueryBuilder = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.InsertableQueryBuilder with typings.cassanknex.mod.TtlableQueryBuilder
  
  type KeyspaceQueryBuilder = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.KeyspaceableQueryBuilder
  
  type MappedDict[B] = org.scalablytyped.runtime.StringDictionary[B]
  
  type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.cassanknex.cassanknexStrings.SelectAsClause with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SelectQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.LimitableQueryBuilder with typings.cassanknex.mod.FromableQueryBuilder
  
  /**
    * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
    */
  type TypeMatchedValue[T, K /* <: /* keyof T */ java.lang.String */, Type, This] = This
  
  type UpdateQueryBuilder[T] = typings.cassanknex.mod.QueryBuilder with typings.cassanknex.mod.WhereableQueryBuilder[T] with typings.cassanknex.mod.UpdateableQueryBuilder[T] with typings.cassanknex.mod.IfableQueryBuilder[T] with typings.cassanknex.mod.TtlableQueryBuilder
}

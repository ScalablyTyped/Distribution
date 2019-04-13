package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilderRoot extends js.Object {
  def alterColumnFamily[T](columnFamily: java.lang.String): AlterColumnFamilyQueryBuilder[T] = js.native
  def alterKeyspace(keyspace: java.lang.String): KeyspaceQueryBuilder = js.native
  def createColumnFamily[T](columnFamily: java.lang.String): CreateColumnFamilyQueryBuilder[T] = js.native
  def createColumnFamilyIfNotExists[T](columnFamily: java.lang.String): CreateColumnFamilyQueryBuilder[T] = js.native
  def createIndex[T](columnFamily: java.lang.String, indexName: java.lang.String, column: java.lang.String): QueryBuilder = js.native
  def createIndexCustom[T](columnFamily: java.lang.String, indexName: java.lang.String, column: java.lang.String): QueryBuilder with CreateableIndexBuilder = js.native
  def createKeyspace(keyspace: java.lang.String): KeyspaceQueryBuilder = js.native
  def createKeyspaceIfNotExists(keyspace: java.lang.String): KeyspaceQueryBuilder = js.native
  def createType[T](typeName: java.lang.String): CreateTypeQueryBuilder[T] = js.native
  def createTypeIfNotExists[T](typeName: java.lang.String): CreateTypeQueryBuilder[T] = js.native
  def delete[T](): DeleteQueryBuilder[T] = js.native
  def dropColumnFamily(columnFamily: java.lang.String): QueryBuilder = js.native
  def dropColumnFamilyIfExists(columnFamily: java.lang.String): QueryBuilder = js.native
  def dropKeyspace(): QueryBuilder = js.native
  def dropKeyspaceIfExists(): QueryBuilder = js.native
  def dropType(): QueryBuilder = js.native
  def dropTypeIfExists(): QueryBuilder = js.native
  def insert[T](values: T): InsertQueryBuilder = js.native
  def insert[T](values: stdLib.Partial[T]): InsertQueryBuilder = js.native
  def select[T](columns: java.lang.String*): SelectQueryBuilder[T] = js.native
  def select[T](values: SelectAsClause[T]): SelectQueryBuilder[T] = js.native
  def truncate(columnFamily: java.lang.String): QueryBuilder = js.native
  def update[T](table: java.lang.String): UpdateQueryBuilder[T] = js.native
}


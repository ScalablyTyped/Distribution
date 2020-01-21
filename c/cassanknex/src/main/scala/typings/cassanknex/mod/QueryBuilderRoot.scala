package typings.cassanknex.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilderRoot extends js.Object {
  def alterColumnFamily[T](columnFamily: String): AlterColumnFamilyQueryBuilder[T] = js.native
  def alterKeyspace(keyspace: String): KeyspaceQueryBuilder = js.native
  def createColumnFamily[T](columnFamily: String): CreateColumnFamilyQueryBuilder[T] = js.native
  def createColumnFamilyIfNotExists[T](columnFamily: String): CreateColumnFamilyQueryBuilder[T] = js.native
  def createIndex[T](columnFamily: String, indexName: String, column: String): QueryBuilder = js.native
  def createIndexCustom[T](columnFamily: String, indexName: String, column: String): QueryBuilder with CreateableIndexBuilder = js.native
  def createKeyspace(keyspace: String): KeyspaceQueryBuilder = js.native
  def createKeyspaceIfNotExists(keyspace: String): KeyspaceQueryBuilder = js.native
  def createType[T](typeName: String): CreateTypeQueryBuilder[T] = js.native
  def createTypeIfNotExists[T](typeName: String): CreateTypeQueryBuilder[T] = js.native
  def delete[T](): DeleteQueryBuilder[T] = js.native
  def dropColumnFamily(columnFamily: String): QueryBuilder = js.native
  def dropColumnFamilyIfExists(columnFamily: String): QueryBuilder = js.native
  def dropKeyspace(): QueryBuilder = js.native
  def dropKeyspaceIfExists(): QueryBuilder = js.native
  def dropType(): QueryBuilder = js.native
  def dropTypeIfExists(): QueryBuilder = js.native
  def insert[T](values: T): InsertQueryBuilder = js.native
  def insert[T](values: Partial[T]): InsertQueryBuilder = js.native
  def select[T](columns: String*): SelectQueryBuilder[T] = js.native
  def select[T](values: SelectAsClause[T]): SelectQueryBuilder[T] = js.native
  def truncate(columnFamily: String): QueryBuilder = js.native
  def update[T](table: String): UpdateQueryBuilder[T] = js.native
}


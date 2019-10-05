package typings.bookshelf.bookshelfMod

import typings.bluebird.bluebirdMod.^
import typings.knex.knexMod.AliasDict
import typings.knex.knexMod.Knex
import typings.knex.knexMod.QueryBuilder
import typings.knex.knexMod.TableDescriptor
import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookshelf
  extends Events[js.Any] {
  var Collection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Collection */ js.Any = js.native
  var Model: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Model */ js.Any = js.native
  var VERSION: String = js.native
  @JSName("knex")
  var knex_Original: Knex[_, js.Array[_]] = js.native
  def knex[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def knex[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def knex[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  def plugin(name: String): Bookshelf = js.native
  def plugin(name: String, options: js.Any): Bookshelf = js.native
  def plugin(name: js.Array[String]): Bookshelf = js.native
  def plugin(name: js.Array[String], options: js.Any): Bookshelf = js.native
  def plugin(name: js.Function): Bookshelf = js.native
  def plugin(name: js.Function, options: js.Any): Bookshelf = js.native
  def transaction[T](callback: js.Function1[/* transaction */ Transaction[_, _], js.Thenable[T]]): ^[T] = js.native
}


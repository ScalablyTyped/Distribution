package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookshelf
  extends Events[js.Any] {
  var Collection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Collection */ js.Any = js.native
  var Model: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Model */ js.Any = js.native
  var VERSION: java.lang.String = js.native
  @JSName("knex")
  var knex_Original: knexLib.knexMod.Knex[_, js.Array[_]] = js.native
  def knex[TRecord2, TResult2](): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def knex[TRecord2, TResult2](tableName: knexLib.knexMod.AliasDict): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def knex[TRecord2, TResult2](tableName: knexLib.knexMod.TableDescriptor): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def plugin(name: java.lang.String): Bookshelf = js.native
  def plugin(name: java.lang.String, options: js.Any): Bookshelf = js.native
  def plugin(name: js.Array[java.lang.String]): Bookshelf = js.native
  def plugin(name: js.Array[java.lang.String], options: js.Any): Bookshelf = js.native
  def plugin(name: js.Function): Bookshelf = js.native
  def plugin(name: js.Function, options: js.Any): Bookshelf = js.native
  def transaction[T](callback: js.Function1[/* transaction */ knexLib.knexMod.Transaction[_, _], js.Thenable[T]]): bluebirdLib.bluebirdMod.^[T] = js.native
}


package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookshelf
  extends bookshelfLib.bookshelfMod.BookshelfNs.Events[js.Any] {
  var Collection: bookshelfLib.Anon_AttributesClassProperties = js.native
  var Model: bookshelfLib.Anon_Attributes = js.native
  var VERSION: java.lang.String = js.native
  @JSName("knex")
  var knex_Original: knexLib.knexMod.Knex = js.native
  def knex(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def knex(tableName: knexLib.TableName): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def knex(tableName: knexLib.knexMod.Identifier): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def plugin(name: java.lang.String): Bookshelf = js.native
  def plugin(name: java.lang.String, options: js.Any): Bookshelf = js.native
  def plugin(name: js.Array[java.lang.String]): Bookshelf = js.native
  def plugin(name: js.Array[java.lang.String], options: js.Any): Bookshelf = js.native
  def plugin(name: js.Function): Bookshelf = js.native
  def plugin(name: js.Function, options: js.Any): Bookshelf = js.native
  def transaction[T](callback: js.Function1[/* transaction */ knexLib.knexMod.KnexNs.Transaction, js.Thenable[T]]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
}


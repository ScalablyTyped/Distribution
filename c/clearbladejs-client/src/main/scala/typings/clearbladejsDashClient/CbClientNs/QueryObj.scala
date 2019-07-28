package typings.clearbladejsDashClient.CbClientNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObj extends js.Object {
  var OR: js.Array[Query]
  var URI: String
  var endpoint: String
  var limit: Double
  var offset: Double
  var query: Query
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def addFilterToQuery(query: QueryObj, condition: QueryConditions, key: String, value: QueryValue): Unit
  def addSortToQuery(query: QueryObj, direction: QuerySortDirections, column: String): Unit
  def ascending(field: String): Unit
  def columns(columnsArray: js.Array[String]): Unit
  def descending(field: String): Unit
  def equalTo(field: String, value: QueryValue): Unit
  def fetch(callback: CbCallback): Unit
  def greaterThan(field: String, value: QueryValue): Unit
  def greaterThanEqualTo(field: String, value: QueryValue): Unit
  def lessThan(field: String, value: QueryValue): Unit
  def lessThanEqualTo(field: String, value: QueryValue): Unit
  def matches(field: String, pattern: RegExp): Unit
  def notEqualTo(field: String, value: QueryValue): Unit
  def or(query: QueryObj): Unit
  def remove(callback: CbCallback): Unit
  def setPage(pageSize: Double, pageNum: Double): Unit
  def update(changes: js.Object, callback: CbCallback): Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    addFilterToQuery: (QueryObj, QueryConditions, String, QueryValue) => Unit,
    addSortToQuery: (QueryObj, QuerySortDirections, String) => Unit,
    ascending: String => Unit,
    columns: js.Array[String] => Unit,
    descending: String => Unit,
    endpoint: String,
    equalTo: (String, QueryValue) => Unit,
    fetch: CbCallback => Unit,
    greaterThan: (String, QueryValue) => Unit,
    greaterThanEqualTo: (String, QueryValue) => Unit,
    lessThan: (String, QueryValue) => Unit,
    lessThanEqualTo: (String, QueryValue) => Unit,
    limit: Double,
    matches: (String, RegExp) => Unit,
    notEqualTo: (String, QueryValue) => Unit,
    offset: Double,
    or: QueryObj => Unit,
    query: Query,
    remove: CbCallback => Unit,
    setPage: (Double, Double) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR, URI = URI, addFilterToQuery = js.Any.fromFunction4(addFilterToQuery), addSortToQuery = js.Any.fromFunction3(addSortToQuery), ascending = js.Any.fromFunction1(ascending), columns = js.Any.fromFunction1(columns), descending = js.Any.fromFunction1(descending), endpoint = endpoint, equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit, matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset, or = js.Any.fromFunction1(or), query = query, remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[QueryObj]
  }
}


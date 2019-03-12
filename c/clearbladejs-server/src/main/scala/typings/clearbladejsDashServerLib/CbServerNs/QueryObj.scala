package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObj extends js.Object {
  var OR: js.Array[Query]
  var URI: java.lang.String
  var id: java.lang.String
  var limit: scala.Double
  var offset: scala.Double
  var query: Query
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def ascending(field: java.lang.String): scala.Unit
  def columns(columnsArray: js.Array[java.lang.String]): scala.Unit
  def descending(field: java.lang.String): scala.Unit
  def equalTo(field: java.lang.String, value: QueryValue): scala.Unit
  def fetch(callback: CbCallback): scala.Unit
  def greaterThan(field: java.lang.String, value: QueryValue): scala.Unit
  def greaterThanEqualTo(field: java.lang.String, value: QueryValue): scala.Unit
  def lessThan(field: java.lang.String, value: QueryValue): scala.Unit
  def lessThanEqualTo(field: java.lang.String, value: QueryValue): scala.Unit
  def matches(field: java.lang.String, pattern: QueryValue): scala.Unit
  def notEqualTo(field: java.lang.String, value: QueryValue): scala.Unit
  def or(query: QueryObj): scala.Unit
  def remove(callback: CbCallback): scala.Unit
  def setPage(pageSize: scala.Double, pageNum: scala.Double): scala.Unit
  def update(changes: js.Object, callback: CbCallback): scala.Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: java.lang.String,
    ascending: java.lang.String => scala.Unit,
    columns: js.Array[java.lang.String] => scala.Unit,
    descending: java.lang.String => scala.Unit,
    equalTo: (java.lang.String, QueryValue) => scala.Unit,
    fetch: CbCallback => scala.Unit,
    greaterThan: (java.lang.String, QueryValue) => scala.Unit,
    greaterThanEqualTo: (java.lang.String, QueryValue) => scala.Unit,
    id: java.lang.String,
    lessThan: (java.lang.String, QueryValue) => scala.Unit,
    lessThanEqualTo: (java.lang.String, QueryValue) => scala.Unit,
    limit: scala.Double,
    matches: (java.lang.String, QueryValue) => scala.Unit,
    notEqualTo: (java.lang.String, QueryValue) => scala.Unit,
    offset: scala.Double,
    or: QueryObj => scala.Unit,
    query: Query,
    remove: CbCallback => scala.Unit,
    setPage: (scala.Double, scala.Double) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR, URI = URI, ascending = js.Any.fromFunction1(ascending), columns = js.Any.fromFunction1(columns), descending = js.Any.fromFunction1(descending), equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), id = id, lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit, matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset, or = js.Any.fromFunction1(or), query = query, remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[QueryObj]
  }
}


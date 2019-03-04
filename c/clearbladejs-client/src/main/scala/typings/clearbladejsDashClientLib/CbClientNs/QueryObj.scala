package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObj extends js.Object {
  var OR: js.Array[Query]
  var URI: java.lang.String
  var endpoint: java.lang.String
  var limit: scala.Double
  var offset: scala.Double
  var query: Query
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def addFilterToQuery(query: QueryObj, condition: QueryConditions, key: java.lang.String, value: QueryValue): scala.Unit
  def addSortToQuery(query: QueryObj, direction: QuerySortDirections, column: java.lang.String): scala.Unit
  def ascending(field: java.lang.String): scala.Unit
  def columns(columnsArray: js.Array[java.lang.String]): scala.Unit
  def descending(field: java.lang.String): scala.Unit
  def equalTo(field: java.lang.String, value: QueryValue): scala.Unit
  def fetch(callback: CbCallback): scala.Unit
  def greaterThan(field: java.lang.String, value: QueryValue): scala.Unit
  def greaterThanEqualTo(field: java.lang.String, value: QueryValue): scala.Unit
  def lessThan(field: java.lang.String, value: QueryValue): scala.Unit
  def lessThanEqualTo(field: java.lang.String, value: QueryValue): scala.Unit
  def matches(field: java.lang.String, pattern: stdLib.RegExp): scala.Unit
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
    addFilterToQuery: js.Function4[QueryObj, QueryConditions, java.lang.String, QueryValue, scala.Unit],
    addSortToQuery: js.Function3[QueryObj, QuerySortDirections, java.lang.String, scala.Unit],
    ascending: js.Function1[java.lang.String, scala.Unit],
    columns: js.Function1[js.Array[java.lang.String], scala.Unit],
    descending: js.Function1[java.lang.String, scala.Unit],
    endpoint: java.lang.String,
    equalTo: js.Function2[java.lang.String, QueryValue, scala.Unit],
    fetch: js.Function1[CbCallback, scala.Unit],
    greaterThan: js.Function2[java.lang.String, QueryValue, scala.Unit],
    greaterThanEqualTo: js.Function2[java.lang.String, QueryValue, scala.Unit],
    lessThan: js.Function2[java.lang.String, QueryValue, scala.Unit],
    lessThanEqualTo: js.Function2[java.lang.String, QueryValue, scala.Unit],
    limit: scala.Double,
    matches: js.Function2[java.lang.String, stdLib.RegExp, scala.Unit],
    notEqualTo: js.Function2[java.lang.String, QueryValue, scala.Unit],
    offset: scala.Double,
    or: js.Function1[QueryObj, scala.Unit],
    query: Query,
    remove: js.Function1[CbCallback, scala.Unit],
    setPage: js.Function2[scala.Double, scala.Double, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function2[js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR, URI = URI, addFilterToQuery = addFilterToQuery, addSortToQuery = addSortToQuery, ascending = ascending, columns = columns, descending = descending, endpoint = endpoint, equalTo = equalTo, fetch = fetch, greaterThan = greaterThan, greaterThanEqualTo = greaterThanEqualTo, lessThan = lessThan, lessThanEqualTo = lessThanEqualTo, limit = limit, matches = matches, notEqualTo = notEqualTo, offset = offset, or = or, query = query, remove = remove, setPage = setPage, systemKey = systemKey, systemSecret = systemSecret, update = update, user = user)
  
    __obj.asInstanceOf[QueryObj]
  }
}


package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

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
  def ascending(field: java.lang.String): Query
  def descending(field: java.lang.String): Query
  def equalTo(field: java.lang.String, value: QueryValue): Query
  def fetch(callback: CbCallback): scala.Unit
  def greaterThan(field: java.lang.String, value: QueryValue): Query
  def greaterThanEqualTo(field: java.lang.String, value: QueryValue): Query
  def lessThan(field: java.lang.String, value: QueryValue): Query
  def lessThanEqualTo(field: java.lang.String, value: QueryValue): Query
  def matches(field: java.lang.String, pattern: java.lang.String): Query
  def notEqualTo(field: java.lang.String, value: QueryValue): Query
  def or(query: QueryObj): Query
  def remove(callback: CbCallback): scala.Unit
  def setPage(pageSize: scala.Double, pageNum: scala.Double): Query
  def update(changes: js.Object, callback: CbCallback): scala.Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: java.lang.String,
    ascending: java.lang.String => Query,
    descending: java.lang.String => Query,
    endpoint: java.lang.String,
    equalTo: (java.lang.String, QueryValue) => Query,
    fetch: CbCallback => scala.Unit,
    greaterThan: (java.lang.String, QueryValue) => Query,
    greaterThanEqualTo: (java.lang.String, QueryValue) => Query,
    lessThan: (java.lang.String, QueryValue) => Query,
    lessThanEqualTo: (java.lang.String, QueryValue) => Query,
    limit: scala.Double,
    matches: (java.lang.String, java.lang.String) => Query,
    notEqualTo: (java.lang.String, QueryValue) => Query,
    offset: scala.Double,
    or: QueryObj => Query,
    query: Query,
    remove: CbCallback => scala.Unit,
    setPage: (scala.Double, scala.Double) => Query,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR, URI = URI, ascending = js.Any.fromFunction1(ascending), descending = js.Any.fromFunction1(descending), endpoint = endpoint, equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit, matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset, or = js.Any.fromFunction1(or), query = query, remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[QueryObj]
  }
}


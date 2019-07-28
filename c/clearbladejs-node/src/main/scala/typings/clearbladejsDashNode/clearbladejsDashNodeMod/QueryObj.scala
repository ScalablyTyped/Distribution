package typings.clearbladejsDashNode.clearbladejsDashNodeMod

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
  def ascending(field: String): Query
  def descending(field: String): Query
  def equalTo(field: String, value: QueryValue): Query
  def fetch(callback: CbCallback): Unit
  def greaterThan(field: String, value: QueryValue): Query
  def greaterThanEqualTo(field: String, value: QueryValue): Query
  def lessThan(field: String, value: QueryValue): Query
  def lessThanEqualTo(field: String, value: QueryValue): Query
  def matches(field: String, pattern: String): Query
  def notEqualTo(field: String, value: QueryValue): Query
  def or(query: QueryObj): Query
  def remove(callback: CbCallback): Unit
  def setPage(pageSize: Double, pageNum: Double): Query
  def update(changes: js.Object, callback: CbCallback): Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => Query,
    descending: String => Query,
    endpoint: String,
    equalTo: (String, QueryValue) => Query,
    fetch: CbCallback => Unit,
    greaterThan: (String, QueryValue) => Query,
    greaterThanEqualTo: (String, QueryValue) => Query,
    lessThan: (String, QueryValue) => Query,
    lessThanEqualTo: (String, QueryValue) => Query,
    limit: Double,
    matches: (String, String) => Query,
    notEqualTo: (String, QueryValue) => Query,
    offset: Double,
    or: QueryObj => Query,
    query: Query,
    remove: CbCallback => Unit,
    setPage: (Double, Double) => Query,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR, URI = URI, ascending = js.Any.fromFunction1(ascending), descending = js.Any.fromFunction1(descending), endpoint = endpoint, equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit, matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset, or = js.Any.fromFunction1(or), query = query, remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction2(update), user = user)
  
    __obj.asInstanceOf[QueryObj]
  }
}


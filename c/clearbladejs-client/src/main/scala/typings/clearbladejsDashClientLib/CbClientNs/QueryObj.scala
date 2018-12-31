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


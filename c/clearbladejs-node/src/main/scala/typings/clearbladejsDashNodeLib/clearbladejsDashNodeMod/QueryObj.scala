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


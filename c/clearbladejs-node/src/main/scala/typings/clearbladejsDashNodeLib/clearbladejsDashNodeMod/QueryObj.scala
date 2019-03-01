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
    ascending: js.Function1[java.lang.String, Query],
    descending: js.Function1[java.lang.String, Query],
    endpoint: java.lang.String,
    equalTo: js.Function2[java.lang.String, QueryValue, Query],
    fetch: js.Function1[CbCallback, scala.Unit],
    greaterThan: js.Function2[java.lang.String, QueryValue, Query],
    greaterThanEqualTo: js.Function2[java.lang.String, QueryValue, Query],
    lessThan: js.Function2[java.lang.String, QueryValue, Query],
    lessThanEqualTo: js.Function2[java.lang.String, QueryValue, Query],
    limit: scala.Double,
    matches: js.Function2[java.lang.String, java.lang.String, Query],
    notEqualTo: js.Function2[java.lang.String, QueryValue, Query],
    offset: scala.Double,
    or: js.Function1[QueryObj, Query],
    query: Query,
    remove: js.Function1[CbCallback, scala.Unit],
    setPage: js.Function2[scala.Double, scala.Double, Query],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function2[js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OR")(OR)
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("ascending")(ascending)
    __obj.updateDynamic("descending")(descending)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("equalTo")(equalTo)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("greaterThan")(greaterThan)
    __obj.updateDynamic("greaterThanEqualTo")(greaterThanEqualTo)
    __obj.updateDynamic("lessThan")(lessThan)
    __obj.updateDynamic("lessThanEqualTo")(lessThanEqualTo)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("notEqualTo")(notEqualTo)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("or")(or)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setPage")(setPage)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[QueryObj]
  }
}


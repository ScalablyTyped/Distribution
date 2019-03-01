package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: java.lang.String
  var endpoint: java.lang.String
  var isUsingCollectionName: scala.Boolean
  var name: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newItem: Item, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def remove(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: java.lang.String,
    columns: js.Function1[CbCallback, scala.Unit],
    count: js.Function2[Query, CbCallback, scala.Unit],
    create: js.Function2[Item, CbCallback, scala.Unit],
    endpoint: java.lang.String,
    fetch: js.Function2[Query, CbCallback, scala.Unit],
    isUsingCollectionName: scala.Boolean,
    name: java.lang.String,
    remove: js.Function2[Query, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[Query, js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("isUsingCollectionName")(isUsingCollectionName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Collection]
  }
}


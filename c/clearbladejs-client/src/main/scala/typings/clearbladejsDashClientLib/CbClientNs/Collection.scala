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
    columns: CbCallback => scala.Unit,
    count: (Query, CbCallback) => scala.Unit,
    create: (Item, CbCallback) => scala.Unit,
    endpoint: java.lang.String,
    fetch: (Query, CbCallback) => scala.Unit,
    isUsingCollectionName: scala.Boolean,
    name: java.lang.String,
    remove: (Query, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (Query, js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), endpoint = endpoint, fetch = js.Any.fromFunction2(fetch), isUsingCollectionName = isUsingCollectionName, name = name, remove = js.Any.fromFunction2(remove), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Collection]
  }
}


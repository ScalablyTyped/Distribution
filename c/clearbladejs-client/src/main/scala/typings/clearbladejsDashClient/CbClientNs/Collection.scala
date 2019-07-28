package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var endpoint: String
  var isUsingCollectionName: Boolean
  var name: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newItem: Item, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    endpoint: String,
    fetch: (Query, CbCallback) => Unit,
    isUsingCollectionName: Boolean,
    name: String,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), endpoint = endpoint, fetch = js.Any.fromFunction2(fetch), isUsingCollectionName = isUsingCollectionName, name = name, remove = js.Any.fromFunction2(remove), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Collection]
  }
}


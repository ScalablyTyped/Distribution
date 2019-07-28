package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(newItem: Item, callback: CbCallback): Unit
  def fetch(query: QueryObj, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    create: (Item, CbCallback) => Unit,
    endpoint: String,
    fetch: (QueryObj, CbCallback) => Unit,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, create = js.Any.fromFunction2(create), endpoint = endpoint, fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Collection]
  }
}


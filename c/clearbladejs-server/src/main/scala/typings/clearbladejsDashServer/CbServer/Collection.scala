package typings.clearbladejsDashServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def addColumn(options: js.Object, callback: CbCallback): Unit
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newItem: Item, callback: CbCallback): Unit
  def deleteCollection(callback: CbCallback): Unit
  def dropColumn(name: String, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Unit,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    deleteCollection: CbCallback => Unit,
    dropColumn: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], addColumn = js.Any.fromFunction2(addColumn), columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), deleteCollection = js.Any.fromFunction1(deleteCollection), dropColumn = js.Any.fromFunction2(dropColumn), fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Collection]
  }
}


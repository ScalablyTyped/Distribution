package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def addColumn(options: js.Object, callback: CbCallback): scala.Unit
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newItem: Item, callback: CbCallback): scala.Unit
  def deleteCollection(callback: CbCallback): scala.Unit
  def dropColumn(name: java.lang.String, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def remove(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: java.lang.String,
    addColumn: (js.Object, CbCallback) => scala.Unit,
    columns: CbCallback => scala.Unit,
    count: (Query, CbCallback) => scala.Unit,
    create: (Item, CbCallback) => scala.Unit,
    deleteCollection: CbCallback => scala.Unit,
    dropColumn: (java.lang.String, CbCallback) => scala.Unit,
    fetch: (Query, CbCallback) => scala.Unit,
    remove: (Query, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (Query, js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, addColumn = js.Any.fromFunction2(addColumn), columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), deleteCollection = js.Any.fromFunction1(deleteCollection), dropColumn = js.Any.fromFunction2(dropColumn), fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Collection]
  }
}


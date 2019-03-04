package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: java.lang.String
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(newItem: Item, callback: CbCallback): scala.Unit
  def fetch(query: QueryObj, callback: CbCallback): scala.Unit
  def remove(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: java.lang.String,
    create: js.Function2[Item, CbCallback, scala.Unit],
    endpoint: java.lang.String,
    fetch: js.Function2[QueryObj, CbCallback, scala.Unit],
    remove: js.Function2[Query, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[Query, js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, create = create, endpoint = endpoint, fetch = fetch, remove = remove, systemKey = systemKey, systemSecret = systemSecret, update = update, user = user)
  
    __obj.asInstanceOf[Collection]
  }
}


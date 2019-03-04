package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  def create(newDevice: js.Object, callback: CbCallback): scala.Unit
  def delete(query: Query, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

object Device {
  @scala.inline
  def apply(
    URI: java.lang.String,
    create: js.Function2[js.Object, CbCallback, scala.Unit],
    delete: js.Function2[Query, CbCallback, scala.Unit],
    fetch: js.Function2[Query, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[Query, js.Object, CbCallback, scala.Unit]
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI, create = create, delete = delete, fetch = fetch, systemKey = systemKey, systemSecret = systemSecret, update = update)
  
    __obj.asInstanceOf[Device]
  }
}


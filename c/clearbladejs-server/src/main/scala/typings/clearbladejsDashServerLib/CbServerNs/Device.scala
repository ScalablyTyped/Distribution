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
    create: (js.Object, CbCallback) => scala.Unit,
    delete: (Query, CbCallback) => scala.Unit,
    fetch: (Query, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (Query, js.Object, CbCallback) => scala.Unit
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI, create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), fetch = js.Any.fromFunction2(fetch), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Device]
  }
}


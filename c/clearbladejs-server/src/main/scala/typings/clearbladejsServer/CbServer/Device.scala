package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  def create(newDevice: js.Object, callback: CbCallback): Unit
  def delete(query: Query, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Device {
  @scala.inline
  def apply(
    URI: String,
    create: (js.Object, CbCallback) => Unit,
    delete: (Query, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), fetch = js.Any.fromFunction2(fetch), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Device]
  }
}


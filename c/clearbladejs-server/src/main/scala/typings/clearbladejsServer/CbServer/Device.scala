package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  def create(newDevice: js.Object, callback: CbCallback): Unit = js.native
  def delete(query: Query, callback: CbCallback): Unit = js.native
  def fetch(query: Query, callback: CbCallback): Unit = js.native
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit = js.native
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
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: (js.Object, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setDelete(value: (Query, CbCallback) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    @scala.inline
    def setFetch(value: (Query, CbCallback) => Unit): Self = this.set("fetch", js.Any.fromFunction2(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}


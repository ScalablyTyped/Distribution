package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def columns(callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def create(newDevice: js.Object, callback: CbCallback): Unit = js.native
  def delete(query: Query, callback: CbCallback): Unit = js.native
  def deleteDeviceByName(name: String, callback: CbCallback): Unit = js.native
  def fetch(query: Query, callback: CbCallback): Unit = js.native
  def getDeviceByName(name: String, callback: CbCallback): Unit = js.native
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit = js.native
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit = js.native
}

object Device {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (js.Object, CbCallback) => Unit,
    delete: (Query, CbCallback) => Unit,
    deleteDeviceByName: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    getDeviceByName: (String, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, Boolean, CbCallback) => Unit,
    updateDeviceByName: (String, js.Object, Boolean, CbCallback) => Unit,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), deleteDeviceByName = js.Any.fromFunction2(deleteDeviceByName), fetch = js.Any.fromFunction2(fetch), getDeviceByName = js.Any.fromFunction2(getDeviceByName), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), updateDeviceByName = js.Any.fromFunction4(updateDeviceByName), user = user.asInstanceOf[js.Any])
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
    def setColumns(value: CbCallback => Unit): Self = this.set("columns", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    @scala.inline
    def setCreate(value: (js.Object, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setDelete(value: (Query, CbCallback) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteDeviceByName(value: (String, CbCallback) => Unit): Self = this.set("deleteDeviceByName", js.Any.fromFunction2(value))
    @scala.inline
    def setFetch(value: (Query, CbCallback) => Unit): Self = this.set("fetch", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDeviceByName(value: (String, CbCallback) => Unit): Self = this.set("getDeviceByName", js.Any.fromFunction2(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Query, js.Object, Boolean, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction4(value))
    @scala.inline
    def setUpdateDeviceByName(value: (String, js.Object, Boolean, CbCallback) => Unit): Self = this.set("updateDeviceByName", js.Any.fromFunction4(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}


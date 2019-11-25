package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newDevice: js.Object, callback: CbCallback): Unit
  def delete(query: Query, callback: CbCallback): Unit
  def deleteDeviceByName(name: String, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def getDeviceByName(name: String, callback: CbCallback): Unit
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
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
}


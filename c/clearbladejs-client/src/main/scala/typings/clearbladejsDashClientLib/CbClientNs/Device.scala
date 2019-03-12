package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newDevice: js.Object, callback: CbCallback): scala.Unit
  def delete(query: Query, callback: CbCallback): scala.Unit
  def deleteDeviceByName(name: java.lang.String, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def getDeviceByName(name: java.lang.String, callback: CbCallback): scala.Unit
  def update(query: Query, `object`: js.Object, trigger: scala.Boolean, callback: CbCallback): scala.Unit
  def updateDeviceByName(name: java.lang.String, `object`: js.Object, trigger: scala.Boolean, callback: CbCallback): scala.Unit
}

object Device {
  @scala.inline
  def apply(
    URI: java.lang.String,
    columns: CbCallback => scala.Unit,
    count: (Query, CbCallback) => scala.Unit,
    create: (js.Object, CbCallback) => scala.Unit,
    delete: (Query, CbCallback) => scala.Unit,
    deleteDeviceByName: (java.lang.String, CbCallback) => scala.Unit,
    fetch: (Query, CbCallback) => scala.Unit,
    getDeviceByName: (java.lang.String, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (Query, js.Object, scala.Boolean, CbCallback) => scala.Unit,
    updateDeviceByName: (java.lang.String, js.Object, scala.Boolean, CbCallback) => scala.Unit,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI, columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), deleteDeviceByName = js.Any.fromFunction2(deleteDeviceByName), fetch = js.Any.fromFunction2(fetch), getDeviceByName = js.Any.fromFunction2(getDeviceByName), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction4(update), updateDeviceByName = js.Any.fromFunction4(updateDeviceByName), user = user)
  
    __obj.asInstanceOf[Device]
  }
}


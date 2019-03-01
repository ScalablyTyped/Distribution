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
    columns: js.Function1[CbCallback, scala.Unit],
    count: js.Function2[Query, CbCallback, scala.Unit],
    create: js.Function2[js.Object, CbCallback, scala.Unit],
    delete: js.Function2[Query, CbCallback, scala.Unit],
    deleteDeviceByName: js.Function2[java.lang.String, CbCallback, scala.Unit],
    fetch: js.Function2[Query, CbCallback, scala.Unit],
    getDeviceByName: js.Function2[java.lang.String, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function4[Query, js.Object, scala.Boolean, CbCallback, scala.Unit],
    updateDeviceByName: js.Function4[java.lang.String, js.Object, scala.Boolean, CbCallback, scala.Unit],
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("deleteDeviceByName")(deleteDeviceByName)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("getDeviceByName")(getDeviceByName)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("updateDeviceByName")(updateDeviceByName)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Device]
  }
}


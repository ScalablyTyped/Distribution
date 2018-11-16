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


package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(name: java.lang.String, body: java.lang.String, callback: CbCallback): scala.Unit
  def delete(name: java.lang.String, callback: CbCallback): scala.Unit
  def execute(name: java.lang.String, params: js.Object, callback: CbCallback): scala.Unit
  def getAllServices(callback: CbCallback): scala.Unit
  def getCompletedServices(callback: CbCallback): scala.Unit
  def getFailedServices(callback: CbCallback): scala.Unit
  def update(name: java.lang.String, body: java.lang.String, callback: CbCallback): scala.Unit
}

object Code {
  @scala.inline
  def apply(
    URI: java.lang.String,
    callTimeout: scala.Double,
    create: js.Function3[java.lang.String, java.lang.String, CbCallback, scala.Unit],
    delete: js.Function2[java.lang.String, CbCallback, scala.Unit],
    execute: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    getAllServices: js.Function1[CbCallback, scala.Unit],
    getCompletedServices: js.Function1[CbCallback, scala.Unit],
    getFailedServices: js.Function1[CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[java.lang.String, java.lang.String, CbCallback, scala.Unit],
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI, callTimeout = callTimeout, create = create, delete = delete, execute = execute, getAllServices = getAllServices, getCompletedServices = getCompletedServices, getFailedServices = getFailedServices, systemKey = systemKey, systemSecret = systemSecret, update = update, user = user)
  
    __obj.asInstanceOf[Code]
  }
}


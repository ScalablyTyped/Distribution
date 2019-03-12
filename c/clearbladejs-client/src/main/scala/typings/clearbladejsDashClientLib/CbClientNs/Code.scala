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
    create: (java.lang.String, java.lang.String, CbCallback) => scala.Unit,
    delete: (java.lang.String, CbCallback) => scala.Unit,
    execute: (java.lang.String, js.Object, CbCallback) => scala.Unit,
    getAllServices: CbCallback => scala.Unit,
    getCompletedServices: CbCallback => scala.Unit,
    getFailedServices: CbCallback => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: (java.lang.String, java.lang.String, CbCallback) => scala.Unit,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI, callTimeout = callTimeout, create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), execute = js.Any.fromFunction3(execute), getAllServices = js.Any.fromFunction1(getAllServices), getCompletedServices = js.Any.fromFunction1(getCompletedServices), getFailedServices = js.Any.fromFunction1(getFailedServices), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Code]
  }
}


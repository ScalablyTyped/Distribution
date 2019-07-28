package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: String
  var callTimeout: Double
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, body: String, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
  def getAllServices(callback: CbCallback): Unit
  def getCompletedServices(callback: CbCallback): Unit
  def getFailedServices(callback: CbCallback): Unit
  def update(name: String, body: String, callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    execute: (String, js.Object, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    getCompletedServices: CbCallback => Unit,
    getFailedServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Unit,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI, callTimeout = callTimeout, create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), execute = js.Any.fromFunction3(execute), getAllServices = js.Any.fromFunction1(getAllServices), getCompletedServices = js.Any.fromFunction1(getCompletedServices), getFailedServices = js.Any.fromFunction1(getFailedServices), systemKey = systemKey, systemSecret = systemSecret, update = js.Any.fromFunction3(update), user = user)
  
    __obj.asInstanceOf[Code]
  }
}


package typings.clearbladejsDashServer.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def execute(name: String, params: js.Object, loggingEnabled: Boolean, callback: CbCallback): Unit
  def getAllServices(callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    execute: (String, js.Object, Boolean, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute), getAllServices = js.Any.fromFunction1(getAllServices), systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[Code]
  }
}


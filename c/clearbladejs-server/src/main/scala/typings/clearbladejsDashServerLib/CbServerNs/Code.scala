package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def execute(name: java.lang.String, params: js.Object, loggingEnabled: scala.Boolean, callback: CbCallback): scala.Unit
  def getAllServices(callback: CbCallback): scala.Unit
}

object Code {
  @scala.inline
  def apply(
    execute: js.Function4[java.lang.String, js.Object, scala.Boolean, CbCallback, scala.Unit],
    getAllServices: js.Function1[CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(execute = execute, getAllServices = getAllServices, systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[Code]
  }
}


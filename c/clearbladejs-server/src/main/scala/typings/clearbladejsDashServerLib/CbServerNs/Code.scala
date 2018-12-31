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


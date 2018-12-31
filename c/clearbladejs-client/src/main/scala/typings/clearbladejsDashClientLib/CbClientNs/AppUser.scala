package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def getUser(callback: CbCallback): scala.Unit
  def setPassword(old_password: java.lang.String, new_password: java.lang.String, callback: CbCallback): scala.Unit
  def setUser(data: js.Object, callback: CbCallback): scala.Unit
}


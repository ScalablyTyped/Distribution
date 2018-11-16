package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppUser extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def allUsers(query: QueryObj, callback: CbCallback): scala.Unit
  def count(query: QueryObj, callback: CbCallback): scala.Unit
  def getUser(callback: CbCallback): scala.Unit
  def setUser(data: js.Object, callback: CbCallback): scala.Unit
  def setUsers(query: QueryObj, data: js.Object, callback: CbCallback): scala.Unit
}


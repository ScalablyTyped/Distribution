package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Analytics extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def getCount(filter: QueryFilter, callback: CbCallback): scala.Unit
  def getEventList(filter: QueryFilter, callback: CbCallback): scala.Unit
  def getEventTotals(filter: QueryFilter, callback: CbCallback): scala.Unit
  def getStorage(filter: QueryFilter, callback: CbCallback): scala.Unit
  def getUserEvents(filter: QueryFilter, callback: CbCallback): scala.Unit
}


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

object Analytics {
  @scala.inline
  def apply(
    URI: java.lang.String,
    getCount: js.Function2[QueryFilter, CbCallback, scala.Unit],
    getEventList: js.Function2[QueryFilter, CbCallback, scala.Unit],
    getEventTotals: js.Function2[QueryFilter, CbCallback, scala.Unit],
    getStorage: js.Function2[QueryFilter, CbCallback, scala.Unit],
    getUserEvents: js.Function2[QueryFilter, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    user: APIUser
  ): Analytics = {
    val __obj = js.Dynamic.literal(URI = URI, getCount = getCount, getEventList = getEventList, getEventTotals = getEventTotals, getStorage = getStorage, getUserEvents = getUserEvents, systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[Analytics]
  }
}


package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analytics extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def getCount(filter: QueryFilter, callback: CbCallback): Unit
  def getEventList(filter: QueryFilter, callback: CbCallback): Unit
  def getEventTotals(filter: QueryFilter, callback: CbCallback): Unit
  def getStorage(filter: QueryFilter, callback: CbCallback): Unit
  def getUserEvents(filter: QueryFilter, callback: CbCallback): Unit
}

object Analytics {
  @scala.inline
  def apply(
    URI: String,
    getCount: (QueryFilter, CbCallback) => Unit,
    getEventList: (QueryFilter, CbCallback) => Unit,
    getEventTotals: (QueryFilter, CbCallback) => Unit,
    getStorage: (QueryFilter, CbCallback) => Unit,
    getUserEvents: (QueryFilter, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Analytics = {
    val __obj = js.Dynamic.literal(URI = URI, getCount = js.Any.fromFunction2(getCount), getEventList = js.Any.fromFunction2(getEventList), getEventTotals = js.Any.fromFunction2(getEventTotals), getStorage = js.Any.fromFunction2(getStorage), getUserEvents = js.Any.fromFunction2(getUserEvents), systemKey = systemKey, systemSecret = systemSecret, user = user)
  
    __obj.asInstanceOf[Analytics]
  }
}


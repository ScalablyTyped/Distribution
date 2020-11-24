package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends js.Object {
  
  var URI: String = js.native
  
  def getCount(filter: QueryFilter, callback: CbCallback): Unit = js.native
  
  def getEventList(filter: QueryFilter, callback: CbCallback): Unit = js.native
  
  def getEventTotals(filter: QueryFilter, callback: CbCallback): Unit = js.native
  
  def getStorage(filter: QueryFilter, callback: CbCallback): Unit = js.native
  
  def getUserEvents(filter: QueryFilter, callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  var user: APIUser = js.native
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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], getCount = js.Any.fromFunction2(getCount), getEventList = js.Any.fromFunction2(getEventList), getEventTotals = js.Any.fromFunction2(getEventTotals), getStorage = js.Any.fromFunction2(getStorage), getUserEvents = js.Any.fromFunction2(getUserEvents), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics]
  }
  
  @scala.inline
  implicit class AnalyticsOps[Self <: Analytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCount(value: (QueryFilter, CbCallback) => Unit): Self = this.set("getCount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventList(value: (QueryFilter, CbCallback) => Unit): Self = this.set("getEventList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventTotals(value: (QueryFilter, CbCallback) => Unit): Self = this.set("getEventTotals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetStorage(value: (QueryFilter, CbCallback) => Unit): Self = this.set("getStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserEvents(value: (QueryFilter, CbCallback) => Unit): Self = this.set("getUserEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}

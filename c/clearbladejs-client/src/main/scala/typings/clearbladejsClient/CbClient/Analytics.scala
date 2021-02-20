package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends StObject {
  
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
  implicit class AnalyticsMutableBuilder[Self <: Analytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCount(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getCount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventList(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getEventList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventTotals(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getEventTotals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetStorage(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserEvents(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getUserEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}

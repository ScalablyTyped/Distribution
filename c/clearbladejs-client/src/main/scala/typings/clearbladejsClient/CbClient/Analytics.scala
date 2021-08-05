package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analytics extends StObject {
  
  var URI: String
  
  def getCount(filter: QueryFilter, callback: CbCallback): Unit
  
  def getEventList(filter: QueryFilter, callback: CbCallback): Unit
  
  def getEventTotals(filter: QueryFilter, callback: CbCallback): Unit
  
  def getStorage(filter: QueryFilter, callback: CbCallback): Unit
  
  def getUserEvents(filter: QueryFilter, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object Analytics {
  
  inline def apply(
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
  
  extension [Self <: Analytics](x: Self) {
    
    inline def setGetCount(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getCount", js.Any.fromFunction2(value))
    
    inline def setGetEventList(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getEventList", js.Any.fromFunction2(value))
    
    inline def setGetEventTotals(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getEventTotals", js.Any.fromFunction2(value))
    
    inline def setGetStorage(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getStorage", js.Any.fromFunction2(value))
    
    inline def setGetUserEvents(value: (QueryFilter, CbCallback) => Unit): Self = StObject.set(x, "getUserEvents", js.Any.fromFunction2(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}

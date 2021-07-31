package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Portal extends StObject {
  
  var URI: String
  
  def fetch(callback: CbCallback): Unit
  
  var name: String
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(data: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Portal {
  
  @scala.inline
  def apply(
    URI: String,
    fetch: CbCallback => Unit,
    name: String,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): Portal = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fetch = js.Any.fromFunction1(fetch), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Portal]
  }
  
  @scala.inline
  implicit class PortalMutableBuilder[Self <: Portal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetch(value: CbCallback => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}

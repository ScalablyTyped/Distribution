package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonType extends StObject {
  
  var defaultAccessToken: String
  
  var defaultServer: String | Resource
  
  def getDefaultTokenCredit(providedKey: String): Credit
}
object IonType {
  
  inline def apply(
    defaultAccessToken: String,
    defaultServer: String | Resource,
    getDefaultTokenCredit: String => Credit
  ): IonType = {
    val __obj = js.Dynamic.literal(defaultAccessToken = defaultAccessToken.asInstanceOf[js.Any], defaultServer = defaultServer.asInstanceOf[js.Any], getDefaultTokenCredit = js.Any.fromFunction1(getDefaultTokenCredit))
    __obj.asInstanceOf[IonType]
  }
  
  extension [Self <: IonType](x: Self) {
    
    inline def setDefaultAccessToken(value: String): Self = StObject.set(x, "defaultAccessToken", value.asInstanceOf[js.Any])
    
    inline def setDefaultServer(value: String | Resource): Self = StObject.set(x, "defaultServer", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultTokenCredit(value: String => Credit): Self = StObject.set(x, "getDefaultTokenCredit", js.Any.fromFunction1(value))
  }
}

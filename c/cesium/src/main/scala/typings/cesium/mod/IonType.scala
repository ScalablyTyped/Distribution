package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonType extends StObject {
  
  var defaultAccessToken: String = js.native
  
  var defaultServer: String | Resource = js.native
  
  def getDefaultTokenCredit(providedKey: String): Credit = js.native
}
object IonType {
  
  @scala.inline
  def apply(
    defaultAccessToken: String,
    defaultServer: String | Resource,
    getDefaultTokenCredit: String => Credit
  ): IonType = {
    val __obj = js.Dynamic.literal(defaultAccessToken = defaultAccessToken.asInstanceOf[js.Any], defaultServer = defaultServer.asInstanceOf[js.Any], getDefaultTokenCredit = js.Any.fromFunction1(getDefaultTokenCredit))
    __obj.asInstanceOf[IonType]
  }
  
  @scala.inline
  implicit class IonTypeMutableBuilder[Self <: IonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAccessToken(value: String): Self = StObject.set(x, "defaultAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultServer(value: String | Resource): Self = StObject.set(x, "defaultServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultTokenCredit(value: String => Credit): Self = StObject.set(x, "getDefaultTokenCredit", js.Any.fromFunction1(value))
  }
}

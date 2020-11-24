package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonType extends js.Object {
  
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
  implicit class IonTypeOps[Self <: IonType] (val x: Self) extends AnyVal {
    
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
    def setDefaultAccessToken(value: String): Self = this.set("defaultAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultServer(value: String | Resource): Self = this.set("defaultServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultTokenCredit(value: String => Credit): Self = this.set("getDefaultTokenCredit", js.Any.fromFunction1(value))
  }
}

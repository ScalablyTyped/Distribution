package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait AddResponseCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.AddResponseCookie
}
object AddResponseCookie {
  
  @scala.inline
  def apply(instanceType: String): AddResponseCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "AddResponseCookie")
    __obj.asInstanceOf[AddResponseCookie]
  }
  
  @scala.inline
  implicit class AddResponseCookieMutableBuilder[Self <: AddResponseCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.AddResponseCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

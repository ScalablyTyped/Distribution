package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edits one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait EditResponseCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.EditResponseCookie
}
object EditResponseCookie {
  
  @scala.inline
  def apply(instanceType: String): EditResponseCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "EditResponseCookie")
    __obj.asInstanceOf[EditResponseCookie]
  }
  
  @scala.inline
  implicit class EditResponseCookieMutableBuilder[Self <: EditResponseCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.EditResponseCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

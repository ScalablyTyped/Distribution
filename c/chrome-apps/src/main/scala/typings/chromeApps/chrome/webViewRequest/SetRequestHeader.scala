package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets the request header of the specified name to the specified value.
  * If a header with the specified name did not exist before, a new one is created.
  * Header name comparison is always case-insensitive.
  * Each request header name occurs only once in each request.
  */
@js.native
trait SetRequestHeader extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.SetRequestHeader = js.native
}
object SetRequestHeader {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.SetRequestHeader): SetRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestHeader]
  }
  
  @scala.inline
  implicit class SetRequestHeaderMutableBuilder[Self <: SetRequestHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.SetRequestHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

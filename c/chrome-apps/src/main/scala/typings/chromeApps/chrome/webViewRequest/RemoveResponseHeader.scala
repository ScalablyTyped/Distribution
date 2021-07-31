package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes all response headers of the specified names and values.
  */
trait RemoveResponseHeader
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.RemoveResponseHeader
}
object RemoveResponseHeader {
  
  @scala.inline
  def apply(instanceType: String): RemoveResponseHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RemoveResponseHeader")
    __obj.asInstanceOf[RemoveResponseHeader]
  }
  
  @scala.inline
  implicit class RemoveResponseHeaderMutableBuilder[Self <: RemoveResponseHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RemoveResponseHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

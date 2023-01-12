package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Matches network events by various criteria.
  */
trait RequestMatcher extends StObject {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RequestMatcher
}
object RequestMatcher {
  
  inline def apply(instanceType: String): RequestMatcher = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RequestMatcher")
    __obj.asInstanceOf[RequestMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestMatcher] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RequestMatcher): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

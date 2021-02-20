package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Matches network events by various criteria.
  */
@js.native
trait RequestMatcher extends StObject {
  
  val instanceType: String = js.native
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.RequestMatcher = js.native
}
object RequestMatcher {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.RequestMatcher): RequestMatcher = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMatcher]
  }
  
  @scala.inline
  implicit class RequestMatcherMutableBuilder[Self <: RequestMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RequestMatcher): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

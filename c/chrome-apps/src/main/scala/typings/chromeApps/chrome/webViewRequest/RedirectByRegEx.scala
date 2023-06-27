package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Redirects a request by applying a regular expression on the URL.
  * The regular expressions use the RE2 syntax.
  * @see https://github.com/google/re2/blob/master/doc/syntax.txt
  */
trait RedirectByRegEx
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectByRegEx
}
object RedirectByRegEx {
  
  inline def apply(instanceType: String): RedirectByRegEx = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RedirectByRegEx")
    __obj.asInstanceOf[RedirectByRegEx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectByRegEx] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectByRegEx): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}

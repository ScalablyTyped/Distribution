package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCookieParams[T] extends StObject {
  
  /**
    * Filter for cookies that will be removed.
    * All empty entries are ignored.
    */
  var filter: T
}
object RemoveCookieParams {
  
  inline def apply[T](filter: T): RemoveCookieParams[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCookieParams[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveCookieParams[?], T] (val x: Self & RemoveCookieParams[T]) extends AnyVal {
    
    inline def setFilter(value: T): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}

package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  * @template T Filter type
  */
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
  
  extension [Self <: RemoveCookieParams[?], T](x: Self & RemoveCookieParams[T]) {
    
    inline def setFilter(value: T): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}

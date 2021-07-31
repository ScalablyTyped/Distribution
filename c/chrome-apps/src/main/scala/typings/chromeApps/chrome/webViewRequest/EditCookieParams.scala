package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  * @template T First parameter type
  * @template K Second parameter type
  */
trait EditCookieParams[T, K] extends StObject {
  
  /**
    * Filter for cookies that will be modified.
    * All empty entries are ignored.
    */
  var filter: T
  
  /**
    * Attributes that shall be overridden in cookies that machted the filter
    * Attributes that are set to an empty string are removed.
    */
  var modification: K
}
object EditCookieParams {
  
  @scala.inline
  def apply[T, K](filter: T, modification: K): EditCookieParams[T, K] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCookieParams[T, K]]
  }
  
  @scala.inline
  implicit class EditCookieParamsMutableBuilder[Self <: EditCookieParams[?, ?], T, K] (val x: Self & (EditCookieParams[T, K])) extends AnyVal {
    
    @scala.inline
    def setFilter(value: T): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification(value: K): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
  }
}

package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabActionCountUpdate extends StObject {
  
  /** The amount to increment the tab's action count by.
    * Negative values will decrement the count
    */
  var increment: Double
  
  /** The tab for which to update the action count. */
  var tabId: Double
}
object TabActionCountUpdate {
  
  inline def apply(increment: Double, tabId: Double): TabActionCountUpdate = {
    val __obj = js.Dynamic.literal(increment = increment.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabActionCountUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabActionCountUpdate] (val x: Self) extends AnyVal {
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}

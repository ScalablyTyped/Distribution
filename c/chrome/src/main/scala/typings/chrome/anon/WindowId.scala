package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowId extends StObject {
  
  /** Optional. The window of the new group. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object WindowId {
  
  inline def apply(): WindowId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowId] (val x: Self) extends AnyVal {
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}

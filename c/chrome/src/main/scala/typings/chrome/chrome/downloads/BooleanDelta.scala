package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanDelta extends StObject {
  
  var current: js.UndefOr[Boolean] = js.undefined
  
  var previous: js.UndefOr[Boolean] = js.undefined
}
object BooleanDelta {
  
  inline def apply(): BooleanDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanDelta] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}

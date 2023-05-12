package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleDelta extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
  
  var previous: js.UndefOr[Double] = js.undefined
}
object DoubleDelta {
  
  inline def apply(): DoubleDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleDelta] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}

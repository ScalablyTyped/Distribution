package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDelta extends StObject {
  
  var current: js.UndefOr[String] = js.undefined
  
  var previous: js.UndefOr[String] = js.undefined
}
object StringDelta {
  
  inline def apply(): StringDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringDelta] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}

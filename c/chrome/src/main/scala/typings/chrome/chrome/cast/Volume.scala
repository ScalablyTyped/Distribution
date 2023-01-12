package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  var level: Double | Null
  
  var muted: Boolean | Null
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal(level = null, muted = null)
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedNull: Self = StObject.set(x, "muted", null)
  }
}

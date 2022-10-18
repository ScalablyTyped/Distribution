package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var baseVersion: Double | Null
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(baseVersion = null)
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
  }
}

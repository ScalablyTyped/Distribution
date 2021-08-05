package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSelfBoolean extends StObject {
  
  var includeSelf: Boolean
}
object IncludeSelfBoolean {
  
  inline def apply(includeSelf: Boolean): IncludeSelfBoolean = {
    val __obj = js.Dynamic.literal(includeSelf = includeSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSelfBoolean]
  }
  
  extension [Self <: IncludeSelfBoolean](x: Self) {
    
    inline def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
  }
}

package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSelf extends StObject {
  
  var includeSelf: js.UndefOr[Boolean] = js.undefined
}
object IncludeSelf {
  
  inline def apply(): IncludeSelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeSelf]
  }
  
  extension [Self <: IncludeSelf](x: Self) {
    
    inline def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    inline def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
  }
}

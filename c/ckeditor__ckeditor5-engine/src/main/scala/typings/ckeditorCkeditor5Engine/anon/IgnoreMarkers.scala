package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreMarkers extends StObject {
  
  var ignoreMarkers: js.UndefOr[Boolean] = js.undefined
  
  var ignoreWhitespaces: js.UndefOr[Boolean] = js.undefined
}
object IgnoreMarkers {
  
  inline def apply(): IgnoreMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreMarkers]
  }
  
  extension [Self <: IgnoreMarkers](x: Self) {
    
    inline def setIgnoreMarkers(value: Boolean): Self = StObject.set(x, "ignoreMarkers", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMarkersUndefined: Self = StObject.set(x, "ignoreMarkers", js.undefined)
    
    inline def setIgnoreWhitespaces(value: Boolean): Self = StObject.set(x, "ignoreWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWhitespacesUndefined: Self = StObject.set(x, "ignoreWhitespaces", js.undefined)
  }
}

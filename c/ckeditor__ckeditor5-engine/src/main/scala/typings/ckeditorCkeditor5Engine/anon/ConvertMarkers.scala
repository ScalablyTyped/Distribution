package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertMarkers extends StObject {
  
  var convertMarkers: js.UndefOr[Boolean] = js.undefined
  
  var rootName: js.UndefOr[String] = js.undefined
  
  var withoutSelection: js.UndefOr[Boolean] = js.undefined
}
object ConvertMarkers {
  
  inline def apply(): ConvertMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertMarkers]
  }
  
  extension [Self <: ConvertMarkers](x: Self) {
    
    inline def setConvertMarkers(value: Boolean): Self = StObject.set(x, "convertMarkers", value.asInstanceOf[js.Any])
    
    inline def setConvertMarkersUndefined: Self = StObject.set(x, "convertMarkers", js.undefined)
    
    inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    inline def setWithoutSelection(value: Boolean): Self = StObject.set(x, "withoutSelection", value.asInstanceOf[js.Any])
    
    inline def setWithoutSelectionUndefined: Self = StObject.set(x, "withoutSelection", js.undefined)
  }
}

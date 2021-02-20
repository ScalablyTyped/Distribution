package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertMarkers extends StObject {
  
  var convertMarkers: js.UndefOr[Boolean] = js.native
  
  var rootName: js.UndefOr[String] = js.native
  
  var withoutSelection: js.UndefOr[Boolean] = js.native
}
object ConvertMarkers {
  
  @scala.inline
  def apply(): ConvertMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertMarkers]
  }
  
  @scala.inline
  implicit class ConvertMarkersMutableBuilder[Self <: ConvertMarkers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertMarkers(value: Boolean): Self = StObject.set(x, "convertMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertMarkersUndefined: Self = StObject.set(x, "convertMarkers", js.undefined)
    
    @scala.inline
    def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    @scala.inline
    def setWithoutSelection(value: Boolean): Self = StObject.set(x, "withoutSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutSelectionUndefined: Self = StObject.set(x, "withoutSelection", js.undefined)
  }
}

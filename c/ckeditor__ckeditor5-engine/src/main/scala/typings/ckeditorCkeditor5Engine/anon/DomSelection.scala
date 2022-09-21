package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.viewDocumentselectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomSelection extends StObject {
  
  var domSelection: typings.std.Selection
  
  var newSelection: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default
  
  var oldSelection: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default
}
object DomSelection {
  
  inline def apply(
    domSelection: typings.std.Selection,
    newSelection: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default,
    oldSelection: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default
  ): DomSelection = {
    val __obj = js.Dynamic.literal(domSelection = domSelection.asInstanceOf[js.Any], newSelection = newSelection.asInstanceOf[js.Any], oldSelection = oldSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomSelection]
  }
  
  extension [Self <: DomSelection](x: Self) {
    
    inline def setDomSelection(value: typings.std.Selection): Self = StObject.set(x, "domSelection", value.asInstanceOf[js.Any])
    
    inline def setNewSelection(value: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default): Self = StObject.set(x, "newSelection", value.asInstanceOf[js.Any])
    
    inline def setOldSelection(value: default | typings.ckeditorCkeditor5Engine.viewSelectionMod.default): Self = StObject.set(x, "oldSelection", value.asInstanceOf[js.Any])
  }
}

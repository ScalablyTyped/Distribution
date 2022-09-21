package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.`[engineDotmodelDotDocumentSelection]`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.`[engineDotmodelDotModel]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSelection extends StObject {
  
  var model: `[engineDotmodelDotModel]`
  
  var selection: `[engineDotmodelDotDocumentSelection]`
}
object ModelSelection {
  
  inline def apply(): ModelSelection = {
    val __obj = js.Dynamic.literal(model = "[engine.model.Model]", selection = "[engine.model.DocumentSelection]")
    __obj.asInstanceOf[ModelSelection]
  }
  
  extension [Self <: ModelSelection](x: Self) {
    
    inline def setModel(value: `[engineDotmodelDotModel]`): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: `[engineDotmodelDotDocumentSelection]`): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}

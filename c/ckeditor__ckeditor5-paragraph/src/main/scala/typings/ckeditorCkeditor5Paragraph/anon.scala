package typings.ckeditorCkeditor5Paragraph

import typings.ckeditorCkeditor5Engine.mod.DocumentSelection
import typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Position extends StObject {
    
    var position: default
  }
  object Position {
    
    inline def apply(position: default): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setPosition(value: default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selection extends StObject {
    
    var selection: js.UndefOr[typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default | DocumentSelection] = js.undefined
  }
  object Selection {
    
    inline def apply(): Selection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setSelection(value: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default | DocumentSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
}

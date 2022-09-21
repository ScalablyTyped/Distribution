package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.viewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/editableelement", JSImport.Default)
  @js.native
  open class default () extends EditableElement
  
  @js.native
  trait EditableElement
    extends typings.ckeditorCkeditor5Engine.containerelementMod.default {
    
    val isFocused: Boolean = js.native
    
    val isReadOnly: Boolean = js.native
  }
}

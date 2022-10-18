package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewEditableelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/editableelement", JSImport.Default)
  @js.native
  open class default () extends EditableElement
  
  @js.native
  trait EditableElement
    extends typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default {
    
    val isFocused: Boolean = js.native
    
    val isReadOnly: Boolean = js.native
  }
}

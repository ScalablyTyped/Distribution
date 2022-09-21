package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rooteditableelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.viewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/rooteditableelement", JSImport.Default)
  @js.native
  open class default protected () extends RootEditableElement {
    def this(document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default, name: String) = this()
  }
  
  @js.native
  trait RootEditableElement
    extends typings.ckeditorCkeditor5Engine.editableelementMod.default {
    
    var rootName: String = js.native
  }
}

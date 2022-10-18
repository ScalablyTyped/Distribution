package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRooteditableelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/rooteditableelement", JSImport.Default)
  @js.native
  open class default protected () extends RootEditableElement {
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default, name: String) = this()
  }
  
  @js.native
  trait RootEditableElement
    extends typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default {
    
    var rootName: String = js.native
  }
}

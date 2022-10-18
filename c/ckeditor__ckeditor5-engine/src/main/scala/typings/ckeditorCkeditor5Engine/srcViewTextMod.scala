package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.ViewItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewTextMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/text", JSImport.Default)
  @js.native
  open class default protected ()
    extends Text
       with ViewItem {
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default, data: String) = this()
  }
  
  @js.native
  trait Text
    extends typings.ckeditorCkeditor5Engine.srcViewNodeMod.default {
    
    val data: String = js.native
    
    def isSimilar(otherNode: Text): Boolean = js.native
  }
}

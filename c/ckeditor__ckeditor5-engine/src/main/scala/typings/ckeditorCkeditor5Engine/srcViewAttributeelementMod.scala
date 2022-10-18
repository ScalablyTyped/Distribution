package typings.ckeditorCkeditor5Engine

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewAttributeelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/attributeelement", JSImport.Default)
  @js.native
  open class default () extends AttributeElement
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/view/attributeelement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/view/attributeelement", "default.DEFAULT_PRIORITY")
    @js.native
    def DEFAULT_PRIORITY: Double = js.native
    inline def DEFAULT_PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AttributeElement
    extends typings.ckeditorCkeditor5Engine.srcViewElementMod.default {
    
    def getElementsWithSameId(): Set[AttributeElement] = js.native
    
    val id: String | Double = js.native
    
    val priority: Double = js.native
  }
}

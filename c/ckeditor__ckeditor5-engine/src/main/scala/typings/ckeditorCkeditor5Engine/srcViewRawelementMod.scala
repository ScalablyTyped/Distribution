package typings.ckeditorCkeditor5Engine

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRawelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/rawelement", JSImport.Default)
  @js.native
  open class default () extends RawElement
  
  @js.native
  trait RawElement
    extends typings.ckeditorCkeditor5Engine.srcViewElementMod.default {
    
    var render: js.UndefOr[
        js.ThisFunction2[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
      ] = js.native
  }
}

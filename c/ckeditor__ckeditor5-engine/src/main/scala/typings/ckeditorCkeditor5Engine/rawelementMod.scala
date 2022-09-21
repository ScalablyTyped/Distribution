package typings.ckeditorCkeditor5Engine

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.viewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/rawelement", JSImport.Default)
  @js.native
  open class default () extends RawElement
  
  @js.native
  trait RawElement
    extends typings.ckeditorCkeditor5Engine.viewElementMod.default {
    
    var render: js.UndefOr[
        js.ThisFunction2[
          /* this */ typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.domconverterMod.default, 
          Unit
        ]
      ] = js.native
  }
}

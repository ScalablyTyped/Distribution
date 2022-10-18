package typings.ckeditorCkeditor5Undo

import typings.ckeditorCkeditor5Undo.anon.TypeofUndoEditing
import typings.ckeditorCkeditor5Undo.anon.TypeofUndoUI
import typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.UndoUI
import typings.ckeditorCkeditor5Undo.srcUndoMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-undo", "Undo")
  @js.native
  open class Undo () extends default
  /* static members */
  object Undo {
    
    @JSImport("@ckeditor/ckeditor5-undo", "Undo.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.Undo = js.native
    
    @JSImport("@ckeditor/ckeditor5-undo", "Undo.requires")
    @js.native
    val requires: js.Tuple2[TypeofUndoEditing, TypeofUndoUI] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-undo", "UndoEditing")
  @js.native
  open class UndoEditing ()
    extends typings.ckeditorCkeditor5Undo.srcUndoeditingMod.default
  /* static members */
  object UndoEditing {
    
    @JSImport("@ckeditor/ckeditor5-undo", "UndoEditing.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.UndoEditing = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-undo", "UndoUi")
  @js.native
  open class UndoUi ()
    extends typings.ckeditorCkeditor5Undo.srcUndouiMod.default
  /* static members */
  object UndoUi {
    
    @JSImport("@ckeditor/ckeditor5-undo", "UndoUi.pluginName")
    @js.native
    val pluginName: UndoUI = js.native
  }
}

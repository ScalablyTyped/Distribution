package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.anon.TypeofIndentEditing
import typings.ckeditorCkeditor5Indent.anon.TypeofIndentUI
import typings.ckeditorCkeditor5Indent.srcIndentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-indent", "Indent")
  @js.native
  open class Indent () extends default
  /* static members */
  object Indent {
    
    @JSImport("@ckeditor/ckeditor5-indent", "Indent.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.Indent = js.native
    
    @JSImport("@ckeditor/ckeditor5-indent", "Indent.requires")
    @js.native
    val requires: js.Tuple2[TypeofIndentEditing, TypeofIndentUI] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentBlock")
  @js.native
  open class IndentBlock ()
    extends typings.ckeditorCkeditor5Indent.srcIndentblockMod.default
  /* static members */
  object IndentBlock {
    
    @JSImport("@ckeditor/ckeditor5-indent", "IndentBlock.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentBlock = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentEditing")
  @js.native
  open class IndentEditing ()
    extends typings.ckeditorCkeditor5Indent.srcIndenteditingMod.default
  /* static members */
  object IndentEditing {
    
    @JSImport("@ckeditor/ckeditor5-indent", "IndentEditing.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentEditing = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentUI")
  @js.native
  open class IndentUI ()
    extends typings.ckeditorCkeditor5Indent.srcIndentuiMod.default
  /* static members */
  object IndentUI {
    
    @JSImport("@ckeditor/ckeditor5-indent", "IndentUI.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentUI = js.native
  }
}

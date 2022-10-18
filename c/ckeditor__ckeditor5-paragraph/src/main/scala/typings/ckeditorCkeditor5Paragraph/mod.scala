package typings.ckeditorCkeditor5Paragraph

import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.blockquote
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.dd
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.div
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.dt
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h1
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h2
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h3
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h4
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h5
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h6
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.li
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.p
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.td
import typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.th
import typings.ckeditorCkeditor5Paragraph.srcParagraphMod.default
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph")
  @js.native
  open class Paragraph () extends default
  /* static members */
  object Paragraph {
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph.paragraphLikeElements")
    @js.native
    def paragraphLikeElements: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th] = js.native
    inline def paragraphLikeElements_=(x: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraphLikeElements")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.Paragraph = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-paragraph", "ParagraphButtonUI")
  @js.native
  open class ParagraphButtonUI protected ()
    extends typings.ckeditorCkeditor5Paragraph.srcParagraphbuttonuiMod.default {
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorWithUI */ Any) = this()
  }
}

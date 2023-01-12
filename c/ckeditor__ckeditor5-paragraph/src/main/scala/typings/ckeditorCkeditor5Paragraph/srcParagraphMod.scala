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
import typings.std.Plugin
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParagraphMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Paragraph
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", "default.paragraphLikeElements")
    @js.native
    def paragraphLikeElements: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th] = js.native
    inline def paragraphLikeElements_=(x: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraphLikeElements")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.Paragraph = js.native
  }
  
  @js.native
  trait Paragraph
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var insertParagraph: typings.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default
      
      var paragraph: typings.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default
    }
    object Commands {
      
      inline def apply(
        insertParagraph: typings.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default,
        paragraph: typings.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default
      ): Commands = {
        val __obj = js.Dynamic.literal(insertParagraph = insertParagraph.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
        
        inline def setInsertParagraph(value: typings.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default): Self = StObject.set(x, "insertParagraph", value.asInstanceOf[js.Any])
        
        inline def setParagraph(value: typings.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Paragraph: typings.ckeditorCkeditor5Paragraph.srcParagraphMod.Paragraph
    }
    object Plugins {
      
      inline def apply(Paragraph: Paragraph): Plugins = {
        val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setParagraph(value: Paragraph): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
      }
    }
  }
}

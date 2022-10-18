package typings.ckeditorCkeditor5Heading

import org.scalablytyped.runtime.Instantiable0
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingEditing
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingUI
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.blockquote
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.dd
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.div
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.dt
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.empty
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h1
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h2
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h3
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h4
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h5
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.h6
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.li
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.none
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.p
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.td
import typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.th
import typings.ckeditorCkeditor5Heading.srcHeadingeditingMod.default
import typings.ckeditorCkeditor5Paragraph.mod.Paragraph
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RootName extends StObject {
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var trim: js.UndefOr[empty | none] = js.undefined
  }
  object RootName {
    
    inline def apply(): RootName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootName]
    }
    
    extension [Self <: RootName](x: Self) {
      
      inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      inline def setTrim(value: empty | none): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait TypeofHeadingEditing
    extends StObject
       with Instantiable0[default] {
    
    val pluginName: HeadingEditing = js.native
    
    val requires: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Paragraph */ js.Any
      ] = js.native
  }
  
  @js.native
  trait TypeofHeadingUI
    extends StObject
       with Instantiable0[typings.ckeditorCkeditor5Heading.srcHeadinguiMod.default] {
    
    val pluginName: HeadingUI = js.native
  }
  
  @js.native
  trait TypeofParagraph
    extends StObject
       with Instantiable0[Paragraph] {
    
    var paragraphLikeElements: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th] = js.native
    
    val pluginName: typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.Paragraph = js.native
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

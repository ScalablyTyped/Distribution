package typings.bibleReferenceFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(style: Style, osis: String): String = (^.asInstanceOf[js.Dynamic].apply(style.asInstanceOf[js.Any], osis.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(style: Style, osis: String, context: String): String = (^.asInstanceOf[js.Dynamic].apply(style.asInstanceOf[js.Any], osis.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("bible-reference-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-long`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-short`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-long`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-short`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-shortest`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-long`
    - typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-short`
  */
  trait Style extends StObject
  object Style {
    
    inline def `esv-long`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-long` = "esv-long".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-long`]
    
    inline def `esv-short`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-short` = "esv-short".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`esv-short`]
    
    inline def `niv-long`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-long` = "niv-long".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-long`]
    
    inline def `niv-short`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-short` = "niv-short".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-short`]
    
    inline def `niv-shortest`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-shortest` = "niv-shortest".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`niv-shortest`]
    
    inline def `nlt-long`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-long` = "nlt-long".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-long`]
    
    inline def `nlt-short`: typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-short` = "nlt-short".asInstanceOf[typings.bibleReferenceFormatter.bibleReferenceFormatterStrings.`nlt-short`]
  }
}

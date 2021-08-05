package typings.changelogParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<changelog-parser.changelog-parser.Options> */
  trait PartialOptions extends StObject {
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var removeMarkdown: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setRemoveMarkdown(value: Boolean): Self = StObject.set(x, "removeMarkdown", value.asInstanceOf[js.Any])
      
      inline def setRemoveMarkdownUndefined: Self = StObject.set(x, "removeMarkdown", js.undefined)
    }
  }
}

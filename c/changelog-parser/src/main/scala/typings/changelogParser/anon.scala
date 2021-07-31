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
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      @scala.inline
      def setRemoveMarkdown(value: Boolean): Self = StObject.set(x, "removeMarkdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMarkdownUndefined: Self = StObject.set(x, "removeMarkdown", js.undefined)
    }
  }
}

package typings.combineSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Source extends StObject {
    
    var source: String
    
    var sourceFile: String
  }
  object Source {
    
    @scala.inline
    def apply(source: String, sourceFile: String): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}

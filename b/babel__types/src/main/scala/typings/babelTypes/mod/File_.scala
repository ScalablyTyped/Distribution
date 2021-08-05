package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File_
  extends StObject
     with BaseNode
     with _Node {
  
  var comments: (js.Array[CommentBlock | CommentLine]) | Null
  
  var program: Program_
  
  var tokens: js.Array[js.Any] | Null
  
  @JSName("type")
  var type_File_ : File
}
object File_ {
  
  inline def apply(program: Program_): File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], comments = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, tokens = null, trailingComments = null)
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[File_]
  }
  
  extension [Self <: File_](x: Self) {
    
    inline def setComments(value: js.Array[CommentBlock | CommentLine]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsVarargs(value: (CommentBlock | CommentLine)*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setProgram(value: Program_): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[js.Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensNull: Self = StObject.set(x, "tokens", null)
    
    inline def setTokensVarargs(value: js.Any*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait File_
  extends StObject
     with BaseNode
     with Standardized {
  
  var comments: (js.Array[CommentBlock | CommentLine]) | Null
  
  var program: Program_
  
  var tokens: js.Array[Any] | Null
  
  @JSName("type")
  var type_File_ : File
}
object File_ {
  
  inline def apply(program: Program_): File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], comments = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, tokens = null, trailingComments = null)
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[File_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File_] (val x: Self) extends AnyVal {
    
    inline def setComments(value: js.Array[CommentBlock | CommentLine]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsVarargs(value: (CommentBlock | CommentLine)*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setProgram(value: Program_): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensNull: Self = StObject.set(x, "tokens", null)
    
    inline def setTokensVarargs(value: Any*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File_
  extends StObject
     with BaseNode
     with Node
     with Standardized {
  
  var comments: js.UndefOr[(js.Array[CommentBlock | CommentLine]) | Null] = js.undefined
  
  var program: Program_
  
  var tokens: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  @JSName("type")
  var type_File_ : File
}
object File_ {
  
  inline def apply(program: Program_): File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[File_]
  }
  
  extension [Self <: File_](x: Self) {
    
    inline def setComments(value: js.Array[CommentBlock | CommentLine]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: (CommentBlock | CommentLine)*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setProgram(value: Program_): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensNull: Self = StObject.set(x, "tokens", null)
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: Any*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

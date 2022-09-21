package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentBlock
  extends StObject
     with BaseComment
     with Comment {
  
  @JSName("type")
  var type_CommentBlock: typings.babelTypes.babelTypesStrings.CommentBlock
}
object CommentBlock {
  
  inline def apply(value: String): CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[CommentBlock]
  }
  
  extension [Self <: CommentBlock](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.CommentBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

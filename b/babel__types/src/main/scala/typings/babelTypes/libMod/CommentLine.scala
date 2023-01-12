package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentLine
  extends StObject
     with BaseComment
     with Comment {
  
  @JSName("type")
  var type_CommentLine: typings.babelTypes.babelTypesStrings.CommentLine
}
object CommentLine {
  
  inline def apply(value: String): CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[CommentLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentLine] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

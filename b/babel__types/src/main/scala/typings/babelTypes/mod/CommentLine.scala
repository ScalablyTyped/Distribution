package typings.babelTypes.mod

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
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: String): CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[CommentLine]
  }
  
  extension [Self <: CommentLine](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

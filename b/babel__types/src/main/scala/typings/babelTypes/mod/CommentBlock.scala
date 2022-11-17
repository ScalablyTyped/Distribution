package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentBlock
  extends StObject
     with BaseComment {
  
  @JSName("type")
  var type_CommentBlock: "CommentBlock"
}
object CommentBlock {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: String): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[CommentBlock]
  }
  
  extension [Self <: CommentBlock](x: Self) {
    
    inline def setType(value: "CommentBlock"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

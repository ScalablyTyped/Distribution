package typings.babelTypes.indexTs37Mod

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
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, value: String): CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[CommentBlock]
  }
  
  @scala.inline
  implicit class CommentBlockMutableBuilder[Self <: CommentBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.CommentBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

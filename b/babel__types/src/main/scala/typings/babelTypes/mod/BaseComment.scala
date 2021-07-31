package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseComment extends StObject {
  
  var end: Double
  
  var loc: SourceLocation
  
  var start: Double
  
  var `type`: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine
  
  var value: String
}
object BaseComment {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): BaseComment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment]
  }
  
  @scala.inline
  implicit class BaseCommentMutableBuilder[Self <: BaseComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

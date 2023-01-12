package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseComment extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var ignore: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocation] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine
  
  var value: String
}
object BaseComment {
  
  inline def apply(
    `type`: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): BaseComment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseComment] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(
      value: typings.babelTypes.babelTypesStrings.CommentBlock | typings.babelTypes.babelTypesStrings.CommentLine
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

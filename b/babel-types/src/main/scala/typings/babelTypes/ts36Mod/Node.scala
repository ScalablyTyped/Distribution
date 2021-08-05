package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var end: Double
  
  var innerComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var loc: SourceLocation
  
  var start: Double
  
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var `type`: String
}
object Node {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, `type`: String): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    inline def setInnerCommentsUndefined: Self = StObject.set(x, "innerComments", js.undefined)
    
    inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value :_*))
    
    inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

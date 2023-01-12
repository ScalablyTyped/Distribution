package typings.babelTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var end: Double | Null
  
  var extra: js.UndefOr[Record[String, Any]] = js.undefined
  
  var innerComments: js.Array[Comment] | Null
  
  var leadingComments: js.Array[Comment] | Null
  
  var loc: SourceLocation | Null
  
  var start: Double | Null
  
  var trailingComments: js.Array[Comment] | Null
  
  var `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any
}
object BaseNode {
  
  inline def apply(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any
  ): BaseNode = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
    
    inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
    
    inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
    
    inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
    
    inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
    
    inline def setType(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

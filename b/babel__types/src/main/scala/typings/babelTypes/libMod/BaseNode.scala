package typings.babelTypes.libMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var end: js.UndefOr[Double | Null] = js.undefined
  
  var extra: js.UndefOr[Record[String, Any]] = js.undefined
  
  var innerComments: js.UndefOr[js.Array[Comment] | Null] = js.undefined
  
  var leadingComments: js.UndefOr[js.Array[Comment] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var start: js.UndefOr[Double | Null] = js.undefined
  
  var trailingComments: js.UndefOr[js.Array[Comment] | Null] = js.undefined
  
  var `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any
}
object BaseNode {
  
  inline def apply(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any
  ): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
    
    inline def setInnerCommentsUndefined: Self = StObject.set(x, "innerComments", js.undefined)
    
    inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
    
    inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
    
    inline def setType(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

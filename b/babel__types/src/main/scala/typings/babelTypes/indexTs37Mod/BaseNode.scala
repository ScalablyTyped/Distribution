package typings.babelTypes.indexTs37Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var end: Double | Null
  
  var extra: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var innerComments: js.Array[Comment] | Null
  
  var leadingComments: js.Array[Comment] | Null
  
  var loc: SourceLocation | Null
  
  var start: Double | Null
  
  var trailingComments: js.Array[Comment] | Null
  
  var `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any
}
object BaseNode {
  
  @scala.inline
  def apply(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any): BaseNode = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  @scala.inline
  implicit class BaseNodeMutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNull: Self = StObject.set(x, "end", null)
    
    @scala.inline
    def setExtra(value: Record[String, js.Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
    
    @scala.inline
    def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value :_*))
    
    @scala.inline
    def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
    
    @scala.inline
    def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = StObject.set(x, "start", null)
    
    @scala.inline
    def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
    
    @scala.inline
    def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value :_*))
    
    @scala.inline
    def setType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

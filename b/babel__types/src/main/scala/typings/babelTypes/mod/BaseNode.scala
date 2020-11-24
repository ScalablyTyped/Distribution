package typings.babelTypes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseNode extends js.Object {
  
  var end: Double | Null = js.native
  
  var extra: js.UndefOr[Record[String, _]] = js.native
  
  var innerComments: js.Array[Comment] | Null = js.native
  
  var leadingComments: js.Array[Comment] | Null = js.native
  
  var loc: SourceLocation | Null = js.native
  
  var start: Double | Null = js.native
  
  var trailingComments: js.Array[Comment] | Null = js.native
  
  var `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any = js.native
}
object BaseNode {
  
  @scala.inline
  def apply(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNull: Self = this.set("end", null)
    
    @scala.inline
    def setExtra(value: Record[String, _]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setInnerCommentsVarargs(value: Comment*): Self = this.set("innerComments", js.Array(value :_*))
    
    @scala.inline
    def setInnerComments(value: js.Array[Comment]): Self = this.set("innerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerCommentsNull: Self = this.set("innerComments", null)
    
    @scala.inline
    def setLeadingCommentsVarargs(value: Comment*): Self = this.set("leadingComments", js.Array(value :_*))
    
    @scala.inline
    def setLeadingComments(value: js.Array[Comment]): Self = this.set("leadingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingCommentsNull: Self = this.set("leadingComments", null)
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = this.set("start", null)
    
    @scala.inline
    def setTrailingCommentsVarargs(value: Comment*): Self = this.set("trailingComments", js.Array(value :_*))
    
    @scala.inline
    def setTrailingComments(value: js.Array[Comment]): Self = this.set("trailingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingCommentsNull: Self = this.set("trailingComments", null)
  }
}

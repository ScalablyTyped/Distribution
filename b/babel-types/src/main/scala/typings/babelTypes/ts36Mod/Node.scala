package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  var end: Double = js.native
  
  var innerComments: js.UndefOr[js.Array[Comment]] = js.native
  
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.native
  
  var loc: SourceLocation = js.native
  
  var start: Double = js.native
  
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.native
  
  var `type`: String = js.native
}
object Node {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: String): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerCommentsVarargs(value: Comment*): Self = this.set("innerComments", js.Array(value :_*))
    
    @scala.inline
    def setInnerComments(value: js.Array[Comment]): Self = this.set("innerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerComments: Self = this.set("innerComments", js.undefined)
    
    @scala.inline
    def setLeadingCommentsVarargs(value: Comment*): Self = this.set("leadingComments", js.Array(value :_*))
    
    @scala.inline
    def setLeadingComments(value: js.Array[Comment]): Self = this.set("leadingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingComments: Self = this.set("leadingComments", js.undefined)
    
    @scala.inline
    def setTrailingCommentsVarargs(value: Comment*): Self = this.set("trailingComments", js.Array(value :_*))
    
    @scala.inline
    def setTrailingComments(value: js.Array[Comment]): Self = this.set("trailingComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingComments: Self = this.set("trailingComments", js.undefined)
  }
}

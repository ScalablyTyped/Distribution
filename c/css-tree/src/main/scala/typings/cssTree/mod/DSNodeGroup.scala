package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeGroup
  extends DSNode
     with DSNodeMultiplied {
  
  var combinator: DSNodeCombinator = js.native
  
  var disallowEmpty: Boolean = js.native
  
  var explicit: Boolean = js.native
  
  var terms: js.Array[DSNode] = js.native
  
  var `type`: Group = js.native
}
object DSNodeGroup {
  
  @scala.inline
  def apply(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeGroup]
  }
  
  @scala.inline
  implicit class DSNodeGroupOps[Self <: DSNodeGroup] (val x: Self) extends AnyVal {
    
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
    def setCombinator(value: DSNodeCombinator): Self = this.set("combinator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowEmpty(value: Boolean): Self = this.set("disallowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsVarargs(value: DSNode*): Self = this.set("terms", js.Array(value :_*))
    
    @scala.inline
    def setTerms(value: js.Array[DSNode]): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Group): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

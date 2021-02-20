package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodegroupHealth extends StObject {
  
  /**
    * Any issues that are associated with the node group. 
    */
  var issues: js.UndefOr[IssueList] = js.native
}
object NodegroupHealth {
  
  @scala.inline
  def apply(): NodegroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupHealth]
  }
  
  @scala.inline
  implicit class NodegroupHealthMutableBuilder[Self <: NodegroupHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssues(value: IssueList): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
  }
}

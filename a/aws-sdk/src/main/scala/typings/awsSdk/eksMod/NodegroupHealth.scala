package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodegroupHealth extends StObject {
  
  /**
    * Any issues that are associated with the node group. 
    */
  var issues: js.UndefOr[IssueList] = js.undefined
}
object NodegroupHealth {
  
  inline def apply(): NodegroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupHealth]
  }
  
  extension [Self <: NodegroupHealth](x: Self) {
    
    inline def setIssues(value: IssueList): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
  }
}

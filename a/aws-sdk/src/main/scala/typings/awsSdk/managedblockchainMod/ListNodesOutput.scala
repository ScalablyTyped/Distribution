package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNodesOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of NodeSummary objects that contain configuration properties for each node.
    */
  var Nodes: js.UndefOr[NodeSummaryList] = js.native
}
object ListNodesOutput {
  
  @scala.inline
  def apply(): ListNodesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesOutput]
  }
  
  @scala.inline
  implicit class ListNodesOutputMutableBuilder[Self <: ListNodesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNodes(value: NodeSummaryList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: NodeSummary*): Self = StObject.set(x, "Nodes", js.Array(value :_*))
  }
}

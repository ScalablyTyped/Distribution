package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationExecutionsResult extends StObject {
  
  /**
    * A list of the executions for the specified association ID.
    */
  var AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeAssociationExecutionsResult {
  
  inline def apply(): DescribeAssociationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationExecutionsResult]
  }
  
  extension [Self <: DescribeAssociationExecutionsResult](x: Self) {
    
    inline def setAssociationExecutions(value: AssociationExecutionsList): Self = StObject.set(x, "AssociationExecutions", value.asInstanceOf[js.Any])
    
    inline def setAssociationExecutionsUndefined: Self = StObject.set(x, "AssociationExecutions", js.undefined)
    
    inline def setAssociationExecutionsVarargs(value: AssociationExecution*): Self = StObject.set(x, "AssociationExecutions", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

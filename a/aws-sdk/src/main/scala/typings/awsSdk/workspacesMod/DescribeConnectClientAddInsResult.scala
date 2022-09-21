package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectClientAddInsResult extends StObject {
  
  /**
    * Information about client add-ins.
    */
  var AddIns: js.UndefOr[ConnectClientAddInList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeConnectClientAddInsResult {
  
  inline def apply(): DescribeConnectClientAddInsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectClientAddInsResult]
  }
  
  extension [Self <: DescribeConnectClientAddInsResult](x: Self) {
    
    inline def setAddIns(value: ConnectClientAddInList): Self = StObject.set(x, "AddIns", value.asInstanceOf[js.Any])
    
    inline def setAddInsUndefined: Self = StObject.set(x, "AddIns", js.undefined)
    
    inline def setAddInsVarargs(value: ConnectClientAddIn*): Self = StObject.set(x, "AddIns", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

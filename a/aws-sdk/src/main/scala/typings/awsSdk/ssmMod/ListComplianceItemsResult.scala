package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComplianceItemsResult extends StObject {
  
  /**
    * A list of compliance information for the specified resource ID. 
    */
  var ComplianceItems: js.UndefOr[ComplianceItemList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListComplianceItemsResult {
  
  @scala.inline
  def apply(): ListComplianceItemsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceItemsResult]
  }
  
  @scala.inline
  implicit class ListComplianceItemsResultMutableBuilder[Self <: ListComplianceItemsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceItems(value: ComplianceItemList): Self = StObject.set(x, "ComplianceItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceItemsUndefined: Self = StObject.set(x, "ComplianceItems", js.undefined)
    
    @scala.inline
    def setComplianceItemsVarargs(value: ComplianceItem*): Self = StObject.set(x, "ComplianceItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

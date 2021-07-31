package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeHistoryRequest extends StObject {
  
  var DomainName: typings.awsSdk.esMod.DomainName
  
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
}
object GetUpgradeHistoryRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): GetUpgradeHistoryRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeHistoryRequest]
  }
  
  @scala.inline
  implicit class GetUpgradeHistoryRequestMutableBuilder[Self <: GetUpgradeHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceiptRuleSetsRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.undefined
}
object ListReceiptRuleSetsRequest {
  
  @scala.inline
  def apply(): ListReceiptRuleSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsRequest]
  }
  
  @scala.inline
  implicit class ListReceiptRuleSetsRequestMutableBuilder[Self <: ListReceiptRuleSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

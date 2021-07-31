package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSummaryResponse extends StObject {
  
  /**
    * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
    */
  var SummaryMap: js.UndefOr[summaryMapType] = js.undefined
}
object GetAccountSummaryResponse {
  
  @scala.inline
  def apply(): GetAccountSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSummaryResponse]
  }
  
  @scala.inline
  implicit class GetAccountSummaryResponseMutableBuilder[Self <: GetAccountSummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummaryMap(value: summaryMapType): Self = StObject.set(x, "SummaryMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryMapUndefined: Self = StObject.set(x, "SummaryMap", js.undefined)
  }
}

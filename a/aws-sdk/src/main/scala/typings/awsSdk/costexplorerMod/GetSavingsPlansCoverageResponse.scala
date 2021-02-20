package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavingsPlansCoverageResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  
  /**
    * The amount of spend that your Savings Plans covered.
    */
  var SavingsPlansCoverages: typings.awsSdk.costexplorerMod.SavingsPlansCoverages = js.native
}
object GetSavingsPlansCoverageResponse {
  
  @scala.inline
  def apply(SavingsPlansCoverages: SavingsPlansCoverages): GetSavingsPlansCoverageResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansCoverages = SavingsPlansCoverages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageResponse]
  }
  
  @scala.inline
  implicit class GetSavingsPlansCoverageResponseMutableBuilder[Self <: GetSavingsPlansCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlansCoverages(value: SavingsPlansCoverages): Self = StObject.set(x, "SavingsPlansCoverages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansCoveragesVarargs(value: SavingsPlansCoverage*): Self = StObject.set(x, "SavingsPlansCoverages", js.Array(value :_*))
  }
}

package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousExportsResponse extends StObject {
  
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined
  
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeContinuousExportsResponse {
  
  @scala.inline
  def apply(): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
  
  @scala.inline
  implicit class DescribeContinuousExportsResponseMutableBuilder[Self <: DescribeContinuousExportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(value: ContinuousExportDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: ContinuousExportDescription*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

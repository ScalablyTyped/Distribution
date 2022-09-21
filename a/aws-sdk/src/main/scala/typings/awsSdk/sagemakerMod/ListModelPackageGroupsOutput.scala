package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelPackageGroupsOutput extends StObject {
  
  /**
    * A list of summaries of the model groups in your Amazon Web Services account.
    */
  var ModelPackageGroupSummaryList: typings.awsSdk.sagemakerMod.ModelPackageGroupSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListModelPackageGroupsOutput {
  
  inline def apply(ModelPackageGroupSummaryList: ModelPackageGroupSummaryList): ListModelPackageGroupsOutput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupSummaryList = ModelPackageGroupSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelPackageGroupsOutput]
  }
  
  extension [Self <: ListModelPackageGroupsOutput](x: Self) {
    
    inline def setModelPackageGroupSummaryList(value: ModelPackageGroupSummaryList): Self = StObject.set(x, "ModelPackageGroupSummaryList", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupSummaryListVarargs(value: ModelPackageGroupSummary*): Self = StObject.set(x, "ModelPackageGroupSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

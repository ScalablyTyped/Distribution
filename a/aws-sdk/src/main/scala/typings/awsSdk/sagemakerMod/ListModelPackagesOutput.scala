package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelPackagesOutput extends StObject {
  
  /**
    * An array of ModelPackageSummary objects, each of which lists a model package.
    */
  var ModelPackageSummaryList: typings.awsSdk.sagemakerMod.ModelPackageSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of model packages, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListModelPackagesOutput {
  
  @scala.inline
  def apply(ModelPackageSummaryList: ModelPackageSummaryList): ListModelPackagesOutput = {
    val __obj = js.Dynamic.literal(ModelPackageSummaryList = ModelPackageSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelPackagesOutput]
  }
  
  @scala.inline
  implicit class ListModelPackagesOutputMutableBuilder[Self <: ListModelPackagesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelPackageSummaryList(value: ModelPackageSummaryList): Self = StObject.set(x, "ModelPackageSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageSummaryListVarargs(value: ModelPackageSummary*): Self = StObject.set(x, "ModelPackageSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

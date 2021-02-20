package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticGpusResult extends StObject {
  
  /**
    * Information about the Elastic Graphics accelerators.
    */
  var ElasticGpuSet: js.UndefOr[typings.awsSdk.ec2Mod.ElasticGpuSet] = js.native
  
  /**
    * The total number of items to return. If the total number of items available is more than the value specified in max-items then a Next-Token will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeElasticGpusResult {
  
  @scala.inline
  def apply(): DescribeElasticGpusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticGpusResult]
  }
  
  @scala.inline
  implicit class DescribeElasticGpusResultMutableBuilder[Self <: DescribeElasticGpusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticGpuSet(value: ElasticGpuSet): Self = StObject.set(x, "ElasticGpuSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuSetUndefined: Self = StObject.set(x, "ElasticGpuSet", js.undefined)
    
    @scala.inline
    def setElasticGpuSetVarargs(value: ElasticGpus*): Self = StObject.set(x, "ElasticGpuSet", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEcsClustersResult extends StObject {
  
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[typings.awsSdk.opsworksMod.EcsClusters] = js.native
  
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeEcsClustersResult {
  
  @scala.inline
  def apply(): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
  
  @scala.inline
  implicit class DescribeEcsClustersResultMutableBuilder[Self <: DescribeEcsClustersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusters(value: EcsClusters): Self = StObject.set(x, "EcsClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClustersUndefined: Self = StObject.set(x, "EcsClusters", js.undefined)
    
    @scala.inline
    def setEcsClustersVarargs(value: EcsCluster*): Self = StObject.set(x, "EcsClusters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

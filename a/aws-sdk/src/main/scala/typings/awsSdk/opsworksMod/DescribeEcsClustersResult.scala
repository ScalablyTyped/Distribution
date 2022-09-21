package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEcsClustersResult extends StObject {
  
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[typings.awsSdk.opsworksMod.EcsClusters] = js.undefined
  
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEcsClustersResult {
  
  inline def apply(): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
  
  extension [Self <: DescribeEcsClustersResult](x: Self) {
    
    inline def setEcsClusters(value: EcsClusters): Self = StObject.set(x, "EcsClusters", value.asInstanceOf[js.Any])
    
    inline def setEcsClustersUndefined: Self = StObject.set(x, "EcsClusters", js.undefined)
    
    inline def setEcsClustersVarargs(value: EcsCluster*): Self = StObject.set(x, "EcsClusters", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

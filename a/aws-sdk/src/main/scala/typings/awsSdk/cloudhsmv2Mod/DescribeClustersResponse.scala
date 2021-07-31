package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersResponse extends StObject {
  
  /**
    * A list of clusters.
    */
  var Clusters: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Clusters] = js.undefined
  
  /**
    * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a subsequent DescribeClusters request to get more clusters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.undefined
}
object DescribeClustersResponse {
  
  @scala.inline
  def apply(): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersResponse]
  }
  
  @scala.inline
  implicit class DescribeClustersResponseMutableBuilder[Self <: DescribeClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: Clusters): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

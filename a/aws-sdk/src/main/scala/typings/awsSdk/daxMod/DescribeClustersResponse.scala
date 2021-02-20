package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClustersResponse extends StObject {
  
  /**
    * The descriptions of your DAX clusters, in response to a DescribeClusters request.
    */
  var Clusters: js.UndefOr[ClusterList] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    def setClusters(value: ClusterList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

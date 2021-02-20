package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClustersResponse extends StObject {
  
  /**
    * The list of clusters.
    */
  var clusters: js.UndefOr[Clusters] = js.native
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
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
    def setClusters(value: Clusters): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
  }
}

package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterResponse extends StObject {
  
  /**
    * The full description of your specified cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object DescribeClusterResponse {
  
  @scala.inline
  def apply(): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResponse]
  }
  
  @scala.inline
  implicit class DescribeClusterResponseMutableBuilder[Self <: DescribeClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}

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
  
  inline def apply(): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResponse]
  }
  
  extension [Self <: DescribeClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}

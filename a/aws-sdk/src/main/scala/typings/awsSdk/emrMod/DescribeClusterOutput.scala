package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterOutput extends StObject {
  
  /**
    * This output contains the details for the requested cluster.
    */
  var Cluster: js.UndefOr[typings.awsSdk.emrMod.Cluster] = js.undefined
}
object DescribeClusterOutput {
  
  inline def apply(): DescribeClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOutput]
  }
  
  extension [Self <: DescribeClusterOutput](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}

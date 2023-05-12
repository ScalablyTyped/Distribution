package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolVnfcResourceInfoMetadata extends StObject {
  
  /**
    * Information about the cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the helm chart.
    */
  var helmChart: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the node group.
    */
  var nodeGroup: js.UndefOr[String] = js.undefined
}
object GetSolVnfcResourceInfoMetadata {
  
  inline def apply(): GetSolVnfcResourceInfoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolVnfcResourceInfoMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolVnfcResourceInfoMetadata] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setHelmChart(value: String): Self = StObject.set(x, "helmChart", value.asInstanceOf[js.Any])
    
    inline def setHelmChartUndefined: Self = StObject.set(x, "helmChart", js.undefined)
    
    inline def setNodeGroup(value: String): Self = StObject.set(x, "nodeGroup", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUndefined: Self = StObject.set(x, "nodeGroup", js.undefined)
  }
}

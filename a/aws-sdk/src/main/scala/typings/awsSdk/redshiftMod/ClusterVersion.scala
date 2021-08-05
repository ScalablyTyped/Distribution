package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterVersion extends StObject {
  
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object ClusterVersion {
  
  inline def apply(): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersion]
  }
  
  extension [Self <: ClusterVersion](x: Self) {
    
    inline def setClusterParameterGroupFamily(value: String): Self = StObject.set(x, "ClusterParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupFamilyUndefined: Self = StObject.set(x, "ClusterParameterGroupFamily", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}

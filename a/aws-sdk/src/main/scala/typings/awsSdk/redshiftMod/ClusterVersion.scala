package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterVersion extends StObject {
  
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.native
}
object ClusterVersion {
  
  @scala.inline
  def apply(): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersion]
  }
  
  @scala.inline
  implicit class ClusterVersionMutableBuilder[Self <: ClusterVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterParameterGroupFamily(value: String): Self = StObject.set(x, "ClusterParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterParameterGroupFamilyUndefined: Self = StObject.set(x, "ClusterParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}

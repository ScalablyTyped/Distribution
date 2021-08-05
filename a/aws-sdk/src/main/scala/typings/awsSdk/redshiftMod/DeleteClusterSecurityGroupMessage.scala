package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterSecurityGroupMessage extends StObject {
  
  /**
    * The name of the cluster security group to be deleted.
    */
  var ClusterSecurityGroupName: String
}
object DeleteClusterSecurityGroupMessage {
  
  inline def apply(ClusterSecurityGroupName: String): DeleteClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSecurityGroupMessage]
  }
  
  extension [Self <: DeleteClusterSecurityGroupMessage](x: Self) {
    
    inline def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
  }
}

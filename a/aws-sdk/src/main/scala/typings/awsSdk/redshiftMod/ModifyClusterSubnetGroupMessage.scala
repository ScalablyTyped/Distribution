package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterSubnetGroupMessage extends StObject {
  
  /**
    * The name of the subnet group to be modified.
    */
  var ClusterSubnetGroupName: String = js.native
  
  /**
    * A text description of the subnet group to be modified.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}
object ModifyClusterSubnetGroupMessage {
  
  @scala.inline
  def apply(ClusterSubnetGroupName: String, SubnetIds: SubnetIdentifierList): ModifyClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterSubnetGroupMessageMutableBuilder[Self <: ModifyClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}

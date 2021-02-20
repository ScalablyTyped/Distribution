package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetMapping extends StObject {
  
  /**
    * The unique identifier for the subnet. 
    */
  var SubnetId: CollectionMemberString = js.native
}
object SubnetMapping {
  
  @scala.inline
  def apply(SubnetId: CollectionMemberString): SubnetMapping = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetMapping]
  }
  
  @scala.inline
  implicit class SubnetMappingMutableBuilder[Self <: SubnetMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetId(value: CollectionMemberString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}

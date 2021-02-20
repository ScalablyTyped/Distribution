package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSubnetGroupResponse extends StObject {
  
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[typings.awsSdk.daxMod.SubnetGroup] = js.native
}
object CreateSubnetGroupResponse {
  
  @scala.inline
  def apply(): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
  
  @scala.inline
  implicit class CreateSubnetGroupResponseMutableBuilder[Self <: CreateSubnetGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}

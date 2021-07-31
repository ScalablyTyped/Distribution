package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcPeeringConnectionResult extends StObject {
  
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnection] = js.undefined
}
object CreateVpcPeeringConnectionResult {
  
  @scala.inline
  def apply(): CreateVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionResult]
  }
  
  @scala.inline
  implicit class CreateVpcPeeringConnectionResultMutableBuilder[Self <: CreateVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcPeeringConnection(value: VpcPeeringConnection): Self = StObject.set(x, "VpcPeeringConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionUndefined: Self = StObject.set(x, "VpcPeeringConnection", js.undefined)
  }
}

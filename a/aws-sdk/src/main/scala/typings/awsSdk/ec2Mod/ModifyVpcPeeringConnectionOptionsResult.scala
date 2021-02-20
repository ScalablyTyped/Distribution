package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcPeeringConnectionOptionsResult extends StObject {
  
  /**
    * Information about the VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
  
  /**
    * Information about the VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
}
object ModifyVpcPeeringConnectionOptionsResult {
  
  @scala.inline
  def apply(): ModifyVpcPeeringConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
  }
  
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsResultMutableBuilder[Self <: ModifyVpcPeeringConnectionOptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = StObject.set(x, "AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "AccepterPeeringConnectionOptions", js.undefined)
    
    @scala.inline
    def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = StObject.set(x, "RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "RequesterPeeringConnectionOptions", js.undefined)
  }
}

package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowVpcInterfacesResponse extends StObject {
  
  /**
    * The ARN of the flow that these VPC interfaces were added to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The details of the newly added VPC interfaces.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.undefined
}
object AddFlowVpcInterfacesResponse {
  
  @scala.inline
  def apply(): AddFlowVpcInterfacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowVpcInterfacesResponse]
  }
  
  @scala.inline
  implicit class AddFlowVpcInterfacesResponseMutableBuilder[Self <: AddFlowVpcInterfacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterface): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterface*): Self = StObject.set(x, "VpcInterfaces", js.Array(value :_*))
  }
}

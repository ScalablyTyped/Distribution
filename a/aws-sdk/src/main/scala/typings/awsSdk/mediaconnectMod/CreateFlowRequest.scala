package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowRequest extends StObject {
  
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
    */
  var AvailabilityZone: js.UndefOr[string] = js.native
  
  /**
    * The entitlements that you want to grant on a flow.
    */
  var Entitlements: js.UndefOr[listOfGrantEntitlementRequest] = js.native
  
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  
  /**
    * The outputs that you want to add to this flow.
    */
  var Outputs: js.UndefOr[listOfAddOutputRequest] = js.native
  
  var Source: js.UndefOr[SetSourceRequest] = js.native
  
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  
  var Sources: js.UndefOr[listOfSetSourceRequest] = js.native
  
  /**
    * The VPC interfaces you want on the flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterfaceRequest] = js.native
}
object CreateFlowRequest {
  
  @scala.inline
  def apply(Name: string): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
  
  @scala.inline
  implicit class CreateFlowRequestMutableBuilder[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEntitlements(value: listOfGrantEntitlementRequest): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    @scala.inline
    def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: listOfAddOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: AddOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: SetSourceRequest): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setSources(value: listOfSetSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SetSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value :_*))
    
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterfaceRequest): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterfaceRequest*): Self = StObject.set(x, "VpcInterfaces", js.Array(value :_*))
  }
}

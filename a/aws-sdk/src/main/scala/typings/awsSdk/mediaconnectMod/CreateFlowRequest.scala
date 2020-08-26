package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowRequest extends js.Object {
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
  implicit class CreateFlowRequestOps[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: string): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = this.set("Entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: listOfGrantEntitlementRequest): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlements: Self = this.set("Entitlements", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: AddOutputRequest*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: listOfAddOutputRequest): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    @scala.inline
    def setSource(value: SetSourceRequest): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setSourceFailoverConfig(value: FailoverConfig): Self = this.set("SourceFailoverConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFailoverConfig: Self = this.set("SourceFailoverConfig", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: SetSourceRequest*): Self = this.set("Sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: listOfSetSourceRequest): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterfaceRequest*): Self = this.set("VpcInterfaces", js.Array(value :_*))
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterfaceRequest): Self = this.set("VpcInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaces: Self = this.set("VpcInterfaces", js.undefined)
  }
  
}


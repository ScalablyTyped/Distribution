package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flow extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
    */
  var AvailabilityZone: string = js.native
  /**
    * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var EgressIp: js.UndefOr[string] = js.native
  /**
    * The entitlements in this flow.
    */
  var Entitlements: listOfEntitlement = js.native
  /**
    * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
    */
  var FlowArn: string = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The outputs in this flow.
    */
  var Outputs: listOfOutput = js.native
  var Source: typings.awsSdk.mediaconnectMod.Source = js.native
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  var Sources: js.UndefOr[listOfSource] = js.native
  /**
    * The current status of the flow.
    */
  var Status: typings.awsSdk.mediaconnectMod.Status = js.native
  /**
    * The VPC Interfaces for this flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.native
}

object Flow {
  @scala.inline
  def apply(
    AvailabilityZone: string,
    Entitlements: listOfEntitlement,
    FlowArn: string,
    Name: string,
    Outputs: listOfOutput,
    Source: Source,
    Status: Status
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  implicit class FlowOps[Self <: Flow] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: string): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntitlementsVarargs(value: Entitlement*): Self = this.set("Entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: listOfEntitlement): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: listOfOutput): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Source): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEgressIp(value: string): Self = this.set("EgressIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressIp: Self = this.set("EgressIp", js.undefined)
    @scala.inline
    def setSourceFailoverConfig(value: FailoverConfig): Self = this.set("SourceFailoverConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFailoverConfig: Self = this.set("SourceFailoverConfig", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("Sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: listOfSource): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterface*): Self = this.set("VpcInterfaces", js.Array(value :_*))
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterface): Self = this.set("VpcInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaces: Self = this.set("VpcInterfaces", js.undefined)
  }
  
}


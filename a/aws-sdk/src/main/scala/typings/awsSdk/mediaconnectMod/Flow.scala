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
    Status: Status,
    Description: string = null,
    EgressIp: string = null,
    SourceFailoverConfig: FailoverConfig = null,
    Sources: listOfSource = null,
    VpcInterfaces: listOfVpcInterface = null
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EgressIp != null) __obj.updateDynamic("EgressIp")(EgressIp.asInstanceOf[js.Any])
    if (SourceFailoverConfig != null) __obj.updateDynamic("SourceFailoverConfig")(SourceFailoverConfig.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (VpcInterfaces != null) __obj.updateDynamic("VpcInterfaces")(VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
}


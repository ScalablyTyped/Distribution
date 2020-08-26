package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  /**
    * An optional description for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: typings.awsSdk.managedblockchainMod.Framework = js.native
  /**
    *  Configuration properties of the blockchain framework relevant to the network configuration. 
    */
  var FrameworkConfiguration: js.UndefOr[NetworkFrameworkConfiguration] = js.native
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: FrameworkVersionString = js.native
  /**
    * Configuration properties for the first member within the network.
    */
  var MemberConfiguration: typings.awsSdk.managedblockchainMod.MemberConfiguration = js.native
  /**
    * The name of the network.
    */
  var Name: NameString = js.native
  /**
    *  The voting rules used by the network to determine if a proposal is approved. 
    */
  var VotingPolicy: typings.awsSdk.managedblockchainMod.VotingPolicy = js.native
}

object CreateNetworkInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    Framework: Framework,
    FrameworkVersion: FrameworkVersionString,
    MemberConfiguration: MemberConfiguration,
    Name: NameString,
    VotingPolicy: VotingPolicy
  ): CreateNetworkInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Framework = Framework.asInstanceOf[js.Any], FrameworkVersion = FrameworkVersion.asInstanceOf[js.Any], MemberConfiguration = MemberConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], VotingPolicy = VotingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInput]
  }
  @scala.inline
  implicit class CreateNetworkInputOps[Self <: CreateNetworkInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramework(value: Framework): Self = this.set("Framework", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameworkVersion(value: FrameworkVersionString): Self = this.set("FrameworkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberConfiguration(value: MemberConfiguration): Self = this.set("MemberConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVotingPolicy(value: VotingPolicy): Self = this.set("VotingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFrameworkConfiguration(value: NetworkFrameworkConfiguration): Self = this.set("FrameworkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameworkConfiguration: Self = this.set("FrameworkConfiguration", js.undefined)
  }
  
}


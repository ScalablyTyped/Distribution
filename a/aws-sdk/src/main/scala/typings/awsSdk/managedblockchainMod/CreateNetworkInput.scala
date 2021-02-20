package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkInput extends StObject {
  
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
  implicit class CreateNetworkInputMutableBuilder[Self <: CreateNetworkInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkConfiguration(value: NetworkFrameworkConfiguration): Self = StObject.set(x, "FrameworkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkConfigurationUndefined: Self = StObject.set(x, "FrameworkConfiguration", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: FrameworkVersionString): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberConfiguration(value: MemberConfiguration): Self = StObject.set(x, "MemberConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotingPolicy(value: VotingPolicy): Self = StObject.set(x, "VotingPolicy", value.asInstanceOf[js.Any])
  }
}

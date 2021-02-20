package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHostInput extends StObject {
  
  /**
    * The name of the host to be created. The name must be unique in the calling AWS account.
    */
  var Name: HostName = js.native
  
  /**
    * The endpoint of the infrastructure to be represented by the host after it is created.
    */
  var ProviderEndpoint: Url = js.native
  
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: typings.awsSdk.codestarconnectionsMod.ProviderType = js.native
  
  /**
    * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be represented by the host must already be connected to the VPC.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.codestarconnectionsMod.VpcConfiguration] = js.native
}
object CreateHostInput {
  
  @scala.inline
  def apply(Name: HostName, ProviderEndpoint: Url, ProviderType: ProviderType): CreateHostInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProviderEndpoint = ProviderEndpoint.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostInput]
  }
  
  @scala.inline
  implicit class CreateHostInputMutableBuilder[Self <: CreateHostInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}

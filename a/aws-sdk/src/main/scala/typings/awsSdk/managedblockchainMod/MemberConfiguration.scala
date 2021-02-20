package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberConfiguration extends StObject {
  
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration = js.native
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network.
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.native
  
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString = js.native
}
object MemberConfiguration {
  
  @scala.inline
  def apply(FrameworkConfiguration: MemberFrameworkConfiguration, Name: NetworkMemberNameString): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
  
  @scala.inline
  implicit class MemberConfigurationMutableBuilder[Self <: MemberConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFrameworkConfiguration(value: MemberFrameworkConfiguration): Self = StObject.set(x, "FrameworkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: NetworkMemberNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

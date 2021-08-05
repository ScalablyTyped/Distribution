package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberConfiguration extends StObject {
  
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network.
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined
  
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString
}
object MemberConfiguration {
  
  inline def apply(FrameworkConfiguration: MemberFrameworkConfiguration, Name: NetworkMemberNameString): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
  
  extension [Self <: MemberConfiguration](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFrameworkConfiguration(value: MemberFrameworkConfiguration): Self = StObject.set(x, "FrameworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setName(value: NetworkMemberNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

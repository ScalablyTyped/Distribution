package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMemberInput extends StObject {
  
  /**
    * Configuration properties for publishing to Amazon CloudWatch Logs.
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined
  
  /**
    * The unique identifier of the member.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the Managed Blockchain network to which the member belongs.
    */
  var NetworkId: ResourceIdString
}
object UpdateMemberInput {
  
  inline def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): UpdateMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberInput]
  }
  
  extension [Self <: UpdateMemberInput](x: Self) {
    
    inline def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}

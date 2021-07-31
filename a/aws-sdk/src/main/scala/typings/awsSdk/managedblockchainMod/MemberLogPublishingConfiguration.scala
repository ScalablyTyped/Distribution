package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration] = js.undefined
}
object MemberLogPublishingConfiguration {
  
  @scala.inline
  def apply(): MemberLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit class MemberLogPublishingConfigurationMutableBuilder[Self <: MemberLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: MemberFabricLogPublishingConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}

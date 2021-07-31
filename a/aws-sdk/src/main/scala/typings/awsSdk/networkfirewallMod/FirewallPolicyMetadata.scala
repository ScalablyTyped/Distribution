package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object FirewallPolicyMetadata {
  
  @scala.inline
  def apply(): FirewallPolicyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyMetadata]
  }
  
  @scala.inline
  implicit class FirewallPolicyMetadataMutableBuilder[Self <: FirewallPolicyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPolicyRule extends StObject {
  
  /**
    * The destination CIDR block for the transit gateway policy rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The port range for the transit gateway policy rule. Currently this is set to * (all).
    */
  var DestinationPortRange: js.UndefOr[String] = js.undefined
  
  /**
    * The meta data tags used for the transit gateway policy rule.
    */
  var MetaData: js.UndefOr[TransitGatewayPolicyRuleMetaData] = js.undefined
  
  /**
    * The protocol used by the transit gateway policy rule.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The source CIDR block for the transit gateway policy rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The port range for the transit gateway policy rule. Currently this is set to * (all).
    */
  var SourcePortRange: js.UndefOr[String] = js.undefined
}
object TransitGatewayPolicyRule {
  
  inline def apply(): TransitGatewayPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPolicyRule]
  }
  
  extension [Self <: TransitGatewayPolicyRule](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationPortRange(value: String): Self = StObject.set(x, "DestinationPortRange", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortRangeUndefined: Self = StObject.set(x, "DestinationPortRange", js.undefined)
    
    inline def setMetaData(value: TransitGatewayPolicyRuleMetaData): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
    
    inline def setMetaDataUndefined: Self = StObject.set(x, "MetaData", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSourceCidrBlock(value: String): Self = StObject.set(x, "SourceCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setSourceCidrBlockUndefined: Self = StObject.set(x, "SourceCidrBlock", js.undefined)
    
    inline def setSourcePortRange(value: String): Self = StObject.set(x, "SourcePortRange", value.asInstanceOf[js.Any])
    
    inline def setSourcePortRangeUndefined: Self = StObject.set(x, "SourcePortRange", js.undefined)
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPolicyRuleMetaData extends StObject {
  
  /**
    * The key name for the transit gateway policy rule meta data tag.
    */
  var MetaDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the key for the transit gateway policy rule meta data tag.
    */
  var MetaDataValue: js.UndefOr[String] = js.undefined
}
object TransitGatewayPolicyRuleMetaData {
  
  inline def apply(): TransitGatewayPolicyRuleMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPolicyRuleMetaData]
  }
  
  extension [Self <: TransitGatewayPolicyRuleMetaData](x: Self) {
    
    inline def setMetaDataKey(value: String): Self = StObject.set(x, "MetaDataKey", value.asInstanceOf[js.Any])
    
    inline def setMetaDataKeyUndefined: Self = StObject.set(x, "MetaDataKey", js.undefined)
    
    inline def setMetaDataValue(value: String): Self = StObject.set(x, "MetaDataValue", value.asInstanceOf[js.Any])
    
    inline def setMetaDataValueUndefined: Self = StObject.set(x, "MetaDataValue", js.undefined)
  }
}

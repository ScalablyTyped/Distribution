package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSMBSettingsInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DescribeSMBSettingsInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeSMBSettingsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBSettingsInput]
  }
  
  @scala.inline
  implicit class DescribeSMBSettingsInputMutableBuilder[Self <: DescribeSMBSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}

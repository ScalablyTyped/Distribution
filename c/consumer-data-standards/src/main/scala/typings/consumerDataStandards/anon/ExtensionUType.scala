package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.X2P1Dot01
import typings.consumerDataStandards.consumerDataStandardsStrings.x2p101Payload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionUType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional extended data provided specific to transaction originated via NPP
    */
  var extensionUType: js.UndefOr[x2p101Payload] = js.undefined
  
  /**
    * Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)
    */
  var payee: js.UndefOr[String] = js.undefined
  
  /**
    * Label of the originating payer. Mandatory for inbound payment
    */
  var payer: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the applicable overlay service. Valid values are: X2P1.01
    */
  var service: X2P1Dot01
  
  var x2p101Payload: js.UndefOr[EndToEndId] = js.undefined
}
object ExtensionUType {
  
  inline def apply(): ExtensionUType = {
    val __obj = js.Dynamic.literal(service = "X2P1.01")
    __obj.asInstanceOf[ExtensionUType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionUType] (val x: Self) extends AnyVal {
    
    inline def setExtensionUType(value: x2p101Payload): Self = StObject.set(x, "extensionUType", value.asInstanceOf[js.Any])
    
    inline def setExtensionUTypeUndefined: Self = StObject.set(x, "extensionUType", js.undefined)
    
    inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayer(value: String): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
    
    inline def setService(value: X2P1Dot01): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setX2p101Payload(value: EndToEndId): Self = StObject.set(x, "x2p101Payload", value.asInstanceOf[js.Any])
    
    inline def setX2p101PayloadUndefined: Self = StObject.set(x, "x2p101Payload", js.undefined)
  }
}

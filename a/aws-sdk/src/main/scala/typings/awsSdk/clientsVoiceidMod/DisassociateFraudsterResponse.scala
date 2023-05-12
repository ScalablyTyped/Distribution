package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFraudsterResponse extends StObject {
  
  var Fraudster: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Fraudster] = js.undefined
}
object DisassociateFraudsterResponse {
  
  inline def apply(): DisassociateFraudsterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateFraudsterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateFraudsterResponse] (val x: Self) extends AnyVal {
    
    inline def setFraudster(value: Fraudster): Self = StObject.set(x, "Fraudster", value.asInstanceOf[js.Any])
    
    inline def setFraudsterUndefined: Self = StObject.set(x, "Fraudster", js.undefined)
  }
}

package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFraudsterResponse extends StObject {
  
  /**
    * Information about the specified fraudster.
    */
  var Fraudster: js.UndefOr[typings.awsSdk.voiceidMod.Fraudster] = js.undefined
}
object DescribeFraudsterResponse {
  
  inline def apply(): DescribeFraudsterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFraudsterResponse]
  }
  
  extension [Self <: DescribeFraudsterResponse](x: Self) {
    
    inline def setFraudster(value: Fraudster): Self = StObject.set(x, "Fraudster", value.asInstanceOf[js.Any])
    
    inline def setFraudsterUndefined: Self = StObject.set(x, "Fraudster", js.undefined)
  }
}

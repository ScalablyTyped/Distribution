package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPaymentConfiguration extends StObject {
  
  /**
    * Specifies who pays for the download and request fees.
    */
  var Payer: typings.awsSdk.s3Mod.Payer
}
object RequestPaymentConfiguration {
  
  inline def apply(Payer: Payer): RequestPaymentConfiguration = {
    val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentConfiguration]
  }
  
  extension [Self <: RequestPaymentConfiguration](x: Self) {
    
    inline def setPayer(value: Payer): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
  }
}

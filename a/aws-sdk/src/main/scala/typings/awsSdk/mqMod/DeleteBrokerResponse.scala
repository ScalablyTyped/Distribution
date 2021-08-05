package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBrokerResponse extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
}
object DeleteBrokerResponse {
  
  inline def apply(): DeleteBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBrokerResponse]
  }
  
  extension [Self <: DeleteBrokerResponse](x: Self) {
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotInstanceStateFault extends StObject {
  
  /**
    * The reason code for the Spot Instance state change.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The message for the Spot Instance state change.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object SpotInstanceStateFault {
  
  inline def apply(): SpotInstanceStateFault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStateFault]
  }
  
  extension [Self <: SpotInstanceStateFault](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}

package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cavv extends StObject {
  
  var cavv: js.UndefOr[String] = js.undefined
  
  var eciFlag: String
  
  var threeDSecureVision: js.UndefOr[String] = js.undefined
  
  var xid: js.UndefOr[String] = js.undefined
}
object Cavv {
  
  inline def apply(eciFlag: String): Cavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cavv]
  }
  
  extension [Self <: Cavv](x: Self) {
    
    inline def setCavv(value: String): Self = StObject.set(x, "cavv", value.asInstanceOf[js.Any])
    
    inline def setCavvUndefined: Self = StObject.set(x, "cavv", js.undefined)
    
    inline def setEciFlag(value: String): Self = StObject.set(x, "eciFlag", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecureVision(value: String): Self = StObject.set(x, "threeDSecureVision", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecureVisionUndefined: Self = StObject.set(x, "threeDSecureVision", js.undefined)
    
    inline def setXid(value: String): Self = StObject.set(x, "xid", value.asInstanceOf[js.Any])
    
    inline def setXidUndefined: Self = StObject.set(x, "xid", js.undefined)
  }
}

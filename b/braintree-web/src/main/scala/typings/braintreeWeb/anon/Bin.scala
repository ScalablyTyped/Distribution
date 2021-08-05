package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bin extends StObject {
  
  var bin: String
  
  var cardType: String
  
  var isNetworkTokenized: Boolean
  
  var lastFour: String
  
  var lastTow: String
}
object Bin {
  
  inline def apply(bin: String, cardType: String, isNetworkTokenized: Boolean, lastFour: String, lastTow: String): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], isNetworkTokenized = isNetworkTokenized.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTow = lastTow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  extension [Self <: Bin](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setIsNetworkTokenized(value: Boolean): Self = StObject.set(x, "isNetworkTokenized", value.asInstanceOf[js.Any])
    
    inline def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
    
    inline def setLastTow(value: String): Self = StObject.set(x, "lastTow", value.asInstanceOf[js.Any])
  }
}

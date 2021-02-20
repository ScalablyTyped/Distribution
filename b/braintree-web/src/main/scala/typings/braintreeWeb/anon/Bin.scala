package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bin extends StObject {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var isNetworkTokenized: Boolean = js.native
  
  var lastFour: String = js.native
  
  var lastTow: String = js.native
}
object Bin {
  
  @scala.inline
  def apply(bin: String, cardType: String, isNetworkTokenized: Boolean, lastFour: String, lastTow: String): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], isNetworkTokenized = isNetworkTokenized.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTow = lastTow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNetworkTokenized(value: Boolean): Self = StObject.set(x, "isNetworkTokenized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTow(value: String): Self = StObject.set(x, "lastTow", value.asInstanceOf[js.Any])
  }
}

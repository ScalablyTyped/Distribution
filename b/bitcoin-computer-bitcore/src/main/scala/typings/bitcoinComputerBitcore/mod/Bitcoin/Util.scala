package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.anon.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Util extends StObject {
  
  val buffer: Reverse
}
object Util {
  
  inline def apply(buffer: Reverse): Util = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Util]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: Reverse): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
  }
}

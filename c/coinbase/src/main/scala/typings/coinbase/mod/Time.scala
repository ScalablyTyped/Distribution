package typings.coinbase.mod

import typings.coinbase.anon.Epoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var data: Epoch
}
object Time {
  
  inline def apply(data: Epoch): Time = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setData(value: Epoch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

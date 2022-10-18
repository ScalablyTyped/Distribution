package typings.coinbase.mod

import typings.coinbase.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencies extends StObject {
  
  var data: js.Array[Id]
}
object Currencies {
  
  inline def apply(data: js.Array[Id]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
  
  extension [Self <: Currencies](x: Self) {
    
    inline def setData(value: js.Array[Id]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Id*): Self = StObject.set(x, "data", js.Array(value*))
  }
}

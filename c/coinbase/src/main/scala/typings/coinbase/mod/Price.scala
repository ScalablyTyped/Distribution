package typings.coinbase.mod

import typings.coinbase.anon.Amount
import typings.coinbase.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  var data: Amount
  
  var warnings: js.UndefOr[js.Array[Id]] = js.undefined
}
object Price {
  
  inline def apply(data: Amount): Price = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setData(value: Amount): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Id]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Id*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}

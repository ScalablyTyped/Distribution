package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressOpts extends StObject {
  
  /**
    * Address label
    */
  var name: js.UndefOr[String] = js.undefined
}
object CreateAddressOpts {
  
  inline def apply(): CreateAddressOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddressOpts] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

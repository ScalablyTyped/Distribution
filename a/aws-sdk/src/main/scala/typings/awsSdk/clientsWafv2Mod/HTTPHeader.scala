package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPHeader extends StObject {
  
  /**
    * The name of the HTTP header.
    */
  var Name: js.UndefOr[HeaderName] = js.undefined
  
  /**
    * The value of the HTTP header.
    */
  var Value: js.UndefOr[HeaderValue] = js.undefined
}
object HTTPHeader {
  
  inline def apply(): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPHeader] (val x: Self) extends AnyVal {
    
    inline def setName(value: HeaderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: HeaderValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}

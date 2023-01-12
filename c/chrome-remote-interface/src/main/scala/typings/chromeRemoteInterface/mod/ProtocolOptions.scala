package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolOptions
  extends StObject
     with BaseOptions {
  
  var local: js.UndefOr[Boolean] = js.undefined
}
object ProtocolOptions {
  
  inline def apply(): ProtocolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolOptions] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}

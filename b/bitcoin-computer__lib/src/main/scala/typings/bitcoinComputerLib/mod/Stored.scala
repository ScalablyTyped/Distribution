package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stored extends StObject {
  
  var _url: String
}
object Stored {
  
  inline def apply(_url: String): Stored = {
    val __obj = js.Dynamic.literal(_url = _url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stored]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stored] (val x: Self) extends AnyVal {
    
    inline def set_url(value: String): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
  }
}

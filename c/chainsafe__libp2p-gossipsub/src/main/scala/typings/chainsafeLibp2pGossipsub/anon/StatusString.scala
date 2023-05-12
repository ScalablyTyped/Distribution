package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusString extends StObject {
  
  var status: String
}
object StatusString {
  
  inline def apply(status: String): StatusString = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusString] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

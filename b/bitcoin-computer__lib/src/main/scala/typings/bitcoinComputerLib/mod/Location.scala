package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var _id: String
  
  var _rev: String
  
  var _root: String
}
object Location {
  
  inline def apply(_id: String, _rev: String, _root: String): Location = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    inline def set_root(value: String): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
  }
}

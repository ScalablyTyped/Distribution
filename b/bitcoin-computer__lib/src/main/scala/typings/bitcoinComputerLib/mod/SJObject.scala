package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SJObject
  extends StObject
     with /* x */ StringDictionary[SJson] {
  
  var _id: String
  
  var _rev: String
  
  var _root: String
}
object SJObject {
  
  inline def apply(_id: String, _rev: String, _root: String): SJObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SJObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SJObject] (val x: Self) extends AnyVal {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    inline def set_root(value: String): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
  }
}

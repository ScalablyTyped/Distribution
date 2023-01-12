package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExtendedLegacy extends StObject {
  
  @JSName("$binary")
  var $binary: String
  
  @JSName("$type")
  var $type: String
}
object BinaryExtendedLegacy {
  
  inline def apply($binary: String, $type: String): BinaryExtendedLegacy = {
    val __obj = js.Dynamic.literal($binary = $binary.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExtendedLegacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryExtendedLegacy] (val x: Self) extends AnyVal {
    
    inline def set$binary(value: String): Self = StObject.set(x, "$binary", value.asInstanceOf[js.Any])
    
    inline def set$type(value: String): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}

package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UUIDExtended extends StObject {
  
  @JSName("$uuid")
  var $uuid: String
}
object UUIDExtended {
  
  inline def apply($uuid: String): UUIDExtended = {
    val __obj = js.Dynamic.literal($uuid = $uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UUIDExtended] (val x: Self) extends AnyVal {
    
    inline def set$uuid(value: String): Self = StObject.set(x, "$uuid", value.asInstanceOf[js.Any])
  }
}

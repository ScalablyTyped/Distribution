package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdExtended extends StObject {
  
  @JSName("$oid")
  var $oid: String
}
object ObjectIdExtended {
  
  inline def apply($oid: String): ObjectIdExtended = {
    val __obj = js.Dynamic.literal($oid = $oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdExtended] (val x: Self) extends AnyVal {
    
    inline def set$oid(value: String): Self = StObject.set(x, "$oid", value.asInstanceOf[js.Any])
  }
}

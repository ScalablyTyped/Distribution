package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleExtended extends StObject {
  
  @JSName("$numberDouble")
  var $numberDouble: String
}
object DoubleExtended {
  
  inline def apply($numberDouble: String): DoubleExtended = {
    val __obj = js.Dynamic.literal($numberDouble = $numberDouble.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleExtended] (val x: Self) extends AnyVal {
    
    inline def set$numberDouble(value: String): Self = StObject.set(x, "$numberDouble", value.asInstanceOf[js.Any])
  }
}

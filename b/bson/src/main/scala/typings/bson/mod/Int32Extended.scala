package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int32Extended extends StObject {
  
  @JSName("$numberInt")
  var $numberInt: String
}
object Int32Extended {
  
  inline def apply($numberInt: String): Int32Extended = {
    val __obj = js.Dynamic.literal($numberInt = $numberInt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int32Extended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Int32Extended] (val x: Self) extends AnyVal {
    
    inline def set$numberInt(value: String): Self = StObject.set(x, "$numberInt", value.asInstanceOf[js.Any])
  }
}

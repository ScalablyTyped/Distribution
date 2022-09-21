package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongExtended extends StObject {
  
  @JSName("$numberLong")
  var $numberLong: String
}
object LongExtended {
  
  inline def apply($numberLong: String): LongExtended = {
    val __obj = js.Dynamic.literal($numberLong = $numberLong.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongExtended]
  }
  
  extension [Self <: LongExtended](x: Self) {
    
    inline def set$numberLong(value: String): Self = StObject.set(x, "$numberLong", value.asInstanceOf[js.Any])
  }
}

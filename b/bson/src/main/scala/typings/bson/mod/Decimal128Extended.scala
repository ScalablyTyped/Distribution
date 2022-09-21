package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decimal128Extended extends StObject {
  
  @JSName("$numberDecimal")
  var $numberDecimal: String
}
object Decimal128Extended {
  
  inline def apply($numberDecimal: String): Decimal128Extended = {
    val __obj = js.Dynamic.literal($numberDecimal = $numberDecimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal128Extended]
  }
  
  extension [Self <: Decimal128Extended](x: Self) {
    
    inline def set$numberDecimal(value: String): Self = StObject.set(x, "$numberDecimal", value.asInstanceOf[js.Any])
  }
}

package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffooterFont extends StObject {
  
  val weight_1: String
}
object TypeoffooterFont {
  
  inline def apply(weight_1: String): TypeoffooterFont = {
    val __obj = js.Dynamic.literal(weight_1 = weight_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoffooterFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeoffooterFont] (val x: Self) extends AnyVal {
    
    inline def setWeight_1(value: String): Self = StObject.set(x, "weight_1", value.asInstanceOf[js.Any])
  }
}

package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftitleFont extends StObject {
  
  val weight: String
}
object TypeoftitleFont {
  
  inline def apply(weight: String): TypeoftitleFont = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftitleFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeoftitleFont] (val x: Self) extends AnyVal {
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}

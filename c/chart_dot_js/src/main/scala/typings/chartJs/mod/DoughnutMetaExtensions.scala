package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoughnutMetaExtensions extends StObject {
  
  var total: Double
}
object DoughnutMetaExtensions {
  
  inline def apply(total: Double): DoughnutMetaExtensions = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoughnutMetaExtensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoughnutMetaExtensions] (val x: Self) extends AnyVal {
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}

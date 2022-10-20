package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var percentage: Double
  
  var status: typings.bullBoard.distUiComponentsConstantsMod.Status
}
object ClassName {
  
  inline def apply(percentage: Double, status: typings.bullBoard.distUiComponentsConstantsMod.Status): ClassName = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: typings.bullBoard.distUiComponentsConstantsMod.Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

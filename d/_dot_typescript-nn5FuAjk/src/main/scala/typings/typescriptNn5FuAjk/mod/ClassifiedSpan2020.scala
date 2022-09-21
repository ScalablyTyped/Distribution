package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifiedSpan2020 extends StObject {
  
  var classificationType: Double
  
  var textSpan: TextSpan
}
object ClassifiedSpan2020 {
  
  inline def apply(classificationType: Double, textSpan: TextSpan): ClassifiedSpan2020 = {
    val __obj = js.Dynamic.literal(classificationType = classificationType.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedSpan2020]
  }
  
  extension [Self <: ClassifiedSpan2020](x: Self) {
    
    inline def setClassificationType(value: Double): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}

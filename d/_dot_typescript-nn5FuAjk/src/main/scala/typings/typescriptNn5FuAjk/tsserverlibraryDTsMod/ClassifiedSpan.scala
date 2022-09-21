package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifiedSpan extends StObject {
  
  var classificationType: ClassificationTypeNames
  
  var textSpan: TextSpan
}
object ClassifiedSpan {
  
  inline def apply(classificationType: ClassificationTypeNames, textSpan: TextSpan): ClassifiedSpan = {
    val __obj = js.Dynamic.literal(classificationType = classificationType.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedSpan]
  }
  
  extension [Self <: ClassifiedSpan](x: Self) {
    
    inline def setClassificationType(value: ClassificationTypeNames): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}

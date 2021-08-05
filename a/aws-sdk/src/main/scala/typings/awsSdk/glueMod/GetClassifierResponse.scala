package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassifierResponse extends StObject {
  
  /**
    * The requested classifier.
    */
  var Classifier: js.UndefOr[typings.awsSdk.glueMod.Classifier] = js.undefined
}
object GetClassifierResponse {
  
  inline def apply(): GetClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifierResponse]
  }
  
  extension [Self <: GetClassifierResponse](x: Self) {
    
    inline def setClassifier(value: Classifier): Self = StObject.set(x, "Classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "Classifier", js.undefined)
  }
}

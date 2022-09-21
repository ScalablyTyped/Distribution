package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassifiersResponse extends StObject {
  
  /**
    * The requested list of classifier objects.
    */
  var Classifiers: js.UndefOr[ClassifierList] = js.undefined
  
  /**
    * A continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetClassifiersResponse {
  
  inline def apply(): GetClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersResponse]
  }
  
  extension [Self <: GetClassifiersResponse](x: Self) {
    
    inline def setClassifiers(value: ClassifierList): Self = StObject.set(x, "Classifiers", value.asInstanceOf[js.Any])
    
    inline def setClassifiersUndefined: Self = StObject.set(x, "Classifiers", js.undefined)
    
    inline def setClassifiersVarargs(value: Classifier*): Self = StObject.set(x, "Classifiers", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

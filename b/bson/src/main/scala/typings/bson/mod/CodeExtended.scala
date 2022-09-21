package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeExtended extends StObject {
  
  @JSName("$code")
  var $code: String | js.Function
  
  @JSName("$scope")
  var $scope: js.UndefOr[Document] = js.undefined
}
object CodeExtended {
  
  inline def apply($code: String | js.Function): CodeExtended = {
    val __obj = js.Dynamic.literal($code = $code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeExtended]
  }
  
  extension [Self <: CodeExtended](x: Self) {
    
    inline def set$code(value: String | js.Function): Self = StObject.set(x, "$code", value.asInstanceOf[js.Any])
    
    inline def set$scope(value: Document): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
    
    inline def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
  }
}

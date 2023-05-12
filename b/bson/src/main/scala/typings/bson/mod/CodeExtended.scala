package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeExtended extends StObject {
  
  @JSName("$code")
  var $code: String
  
  @JSName("$scope")
  var $scope: js.UndefOr[Document] = js.undefined
}
object CodeExtended {
  
  inline def apply($code: String): CodeExtended = {
    val __obj = js.Dynamic.literal($code = $code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeExtended]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeExtended] (val x: Self) extends AnyVal {
    
    inline def set$code(value: String): Self = StObject.set(x, "$code", value.asInstanceOf[js.Any])
    
    inline def set$scope(value: Document): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
    
    inline def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
  }
}

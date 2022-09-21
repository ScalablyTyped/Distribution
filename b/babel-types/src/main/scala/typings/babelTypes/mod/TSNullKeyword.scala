package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNullKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSNullKeyword: typings.babelTypes.babelTypesStrings.TSNullKeyword
}
object TSNullKeyword {
  
  @JSImport("babel-types", "TSNullKeyword")
  @js.native
  def apply(): TSNullKeyword = js.native
  
  extension [Self <: TSNullKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

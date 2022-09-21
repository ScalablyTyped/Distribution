package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNumberKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSNumberKeyword: typings.babelTypes.babelTypesStrings.TSNumberKeyword
}
object TSNumberKeyword {
  
  @JSImport("babel-types", "TSNumberKeyword")
  @js.native
  def apply(): TSNumberKeyword = js.native
  
  extension [Self <: TSNumberKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

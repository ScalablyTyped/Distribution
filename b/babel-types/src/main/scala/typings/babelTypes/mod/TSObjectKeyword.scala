package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSObjectKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSObjectKeyword: typings.babelTypes.babelTypesStrings.TSObjectKeyword
}
object TSObjectKeyword {
  
  @JSImport("babel-types", "TSObjectKeyword")
  @js.native
  def apply(): TSObjectKeyword = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSObjectKeyword] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

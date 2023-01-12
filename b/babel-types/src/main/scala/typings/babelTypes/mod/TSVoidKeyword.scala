package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSVoidKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSVoidKeyword: typings.babelTypes.babelTypesStrings.TSVoidKeyword
}
object TSVoidKeyword {
  
  @JSImport("babel-types", "TSVoidKeyword")
  @js.native
  def apply(): TSVoidKeyword = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSVoidKeyword] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

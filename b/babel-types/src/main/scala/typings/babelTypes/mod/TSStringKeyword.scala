package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSStringKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSStringKeyword: typings.babelTypes.babelTypesStrings.TSStringKeyword
}
object TSStringKeyword {
  
  @JSImport("babel-types", "TSStringKeyword")
  @js.native
  def apply(): TSStringKeyword = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSStringKeyword] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUndefinedKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
}
object TSUndefinedKeyword {
  
  @JSImport("babel-types", "TSUndefinedKeyword")
  @js.native
  def apply(): TSUndefinedKeyword = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSUndefinedKeyword] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

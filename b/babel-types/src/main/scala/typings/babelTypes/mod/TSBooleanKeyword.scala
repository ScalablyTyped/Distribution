package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSBooleanKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSBooleanKeyword: typings.babelTypes.babelTypesStrings.TSBooleanKeyword
}
object TSBooleanKeyword {
  
  @JSImport("babel-types", "TSBooleanKeyword")
  @js.native
  def apply(): TSBooleanKeyword = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSBooleanKeyword] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSBooleanKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

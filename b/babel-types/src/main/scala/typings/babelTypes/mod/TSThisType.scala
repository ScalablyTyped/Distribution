package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSThisType
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSThisType: typings.babelTypes.babelTypesStrings.TSThisType
}
object TSThisType {
  
  @JSImport("babel-types", "TSThisType")
  @js.native
  def apply(): TSThisType = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSThisType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadElement_
  extends StObject
     with BaseNode
     with Node
     with Standardized
     with UnaryLike {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadElement_ : SpreadElement
}
object SpreadElement_ {
  
  inline def apply(argument: Expression): SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[SpreadElement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadElement_] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.SpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use `SpreadElement`
  */
trait SpreadProperty1
  extends StObject
     with BaseNode
     with DeprecatedAliases
     with Node {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadProperty1: SpreadProperty
}
object SpreadProperty1 {
  
  inline def apply(argument: Expression): SpreadProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[SpreadProperty1]
  }
  
  extension [Self <: SpreadProperty1](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Node
     with Pureish
     with Standardized {
  
  @JSName("type")
  var type_StringLiteral_ : StringLiteral
  
  var value: String
}
object StringLiteral_ {
  
  inline def apply(value: String): StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringLiteral_] (val x: Self) extends AnyVal {
    
    inline def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

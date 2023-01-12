package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Node
     with Pureish
     with Standardized {
  
  @JSName("type")
  var type_BigIntLiteral_ : BigIntLiteral
  
  var value: String
}
object BigIntLiteral_ {
  
  inline def apply(value: String): BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[BigIntLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigIntLiteral_] (val x: Self) extends AnyVal {
    
    inline def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

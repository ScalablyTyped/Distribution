package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveLiteral_
  extends StObject
     with BaseNode
     with Node
     with Standardized {
  
  @JSName("type")
  var type_DirectiveLiteral_ : DirectiveLiteral
  
  var value: String
}
object DirectiveLiteral_ {
  
  inline def apply(value: String): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[DirectiveLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveLiteral_] (val x: Self) extends AnyVal {
    
    inline def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

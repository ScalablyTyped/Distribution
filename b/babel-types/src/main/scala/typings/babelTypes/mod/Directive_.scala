package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive_
  extends StObject
     with Node {
  
  @JSName("type")
  var type_Directive_ : Directive
  
  var value: DirectiveLiteral_
}
object Directive_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: DirectiveLiteral_): Directive_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[Directive_]
  }
  
  extension [Self <: Directive_](x: Self) {
    
    inline def setType(value: Directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DirectiveLiteral_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

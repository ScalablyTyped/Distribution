package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.RestProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestProperty_
  extends StObject
     with Node
     with UnaryLike {
  
  var argument: LVal
  
  @JSName("type")
  var type_RestProperty_ : RestProperty
}
object RestProperty_ {
  
  inline def apply(argument: LVal, end: Double, loc: SourceLocation, start: Double): RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[RestProperty_]
  }
  
  extension [Self <: RestProperty_](x: Self) {
    
    inline def setArgument(value: LVal): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: RestProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

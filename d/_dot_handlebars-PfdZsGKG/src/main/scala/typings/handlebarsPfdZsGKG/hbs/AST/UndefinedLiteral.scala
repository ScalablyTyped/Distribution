package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndefinedLiteral
  extends StObject
     with Node {
  
  @JSName("type")
  var type_UndefinedLiteral: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.UndefinedLiteral
}
object UndefinedLiteral {
  
  inline def apply(loc: SourceLocation): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  extension [Self <: UndefinedLiteral](x: Self) {
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

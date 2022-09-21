package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral
  extends StObject
     with Node {
  
  @JSName("type")
  var type_NullLiteral: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.NullLiteral
}
object NullLiteral {
  
  inline def apply(loc: SourceLocation): NullLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral]
  }
  
  extension [Self <: NullLiteral](x: Self) {
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

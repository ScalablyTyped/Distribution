package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyStatement_
  extends StObject
     with Node
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement_ : EmptyStatement
}
object EmptyStatement_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement_]
  }
  
  extension [Self <: EmptyStatement_](x: Self) {
    
    inline def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

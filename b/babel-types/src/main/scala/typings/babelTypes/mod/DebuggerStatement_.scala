package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerStatement_
  extends StObject
     with Node
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement_ : DebuggerStatement
}
object DebuggerStatement_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[DebuggerStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebuggerStatement_] (val x: Self) extends AnyVal {
    
    inline def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

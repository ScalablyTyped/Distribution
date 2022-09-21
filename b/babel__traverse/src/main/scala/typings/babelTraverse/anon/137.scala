package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  var `type`: DebuggerStatement
}
object `137` {
  
  inline def apply(): `137` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[`137`]
  }
  
  extension [Self <: `137`](x: Self) {
    
    inline def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

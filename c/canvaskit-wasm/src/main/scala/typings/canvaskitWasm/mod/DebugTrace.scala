package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugTrace
  extends StObject
     with EmbindObject[DebugTrace] {
  
  def writeTrace(): String
}
object DebugTrace {
  
  inline def apply(
    delete: () => Unit,
    deleteLater: () => Unit,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean,
    writeTrace: () => String
  ): DebugTrace = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), writeTrace = js.Any.fromFunction0(writeTrace))
    __obj.asInstanceOf[DebugTrace]
  }
  
  extension [Self <: DebugTrace](x: Self) {
    
    inline def setWriteTrace(value: () => String): Self = StObject.set(x, "writeTrace", js.Any.fromFunction0(value))
  }
}

package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbindSingleton extends StObject {
  
  // Technically Embind includes the other methods too, but they should not be called for a
  // singleton.
  def isAliasOf(other: js.Any): Boolean
}
object EmbindSingleton {
  
  inline def apply(isAliasOf: js.Any => Boolean): EmbindSingleton = {
    val __obj = js.Dynamic.literal(isAliasOf = js.Any.fromFunction1(isAliasOf))
    __obj.asInstanceOf[EmbindSingleton]
  }
  
  extension [Self <: EmbindSingleton](x: Self) {
    
    inline def setIsAliasOf(value: js.Any => Boolean): Self = StObject.set(x, "isAliasOf", js.Any.fromFunction1(value))
  }
}

package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalQueryComparisonOptions extends StObject {
  
  def setAsDefault(): Unit
}
object LocalQueryComparisonOptions {
  
  inline def apply(setAsDefault: () => Unit): LocalQueryComparisonOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault))
    __obj.asInstanceOf[LocalQueryComparisonOptions]
  }
  
  extension [Self <: LocalQueryComparisonOptions](x: Self) {
    
    inline def setSetAsDefault(value: () => Unit): Self = StObject.set(x, "setAsDefault", js.Any.fromFunction0(value))
  }
}

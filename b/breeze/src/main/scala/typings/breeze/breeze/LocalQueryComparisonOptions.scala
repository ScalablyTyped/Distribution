package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalQueryComparisonOptions extends StObject {
  
  def setAsDefault(): Unit
}
object LocalQueryComparisonOptions {
  
  @scala.inline
  def apply(setAsDefault: () => Unit): LocalQueryComparisonOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault))
    __obj.asInstanceOf[LocalQueryComparisonOptions]
  }
  
  @scala.inline
  implicit class LocalQueryComparisonOptionsMutableBuilder[Self <: LocalQueryComparisonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAsDefault(value: () => Unit): Self = StObject.set(x, "setAsDefault", js.Any.fromFunction0(value))
  }
}

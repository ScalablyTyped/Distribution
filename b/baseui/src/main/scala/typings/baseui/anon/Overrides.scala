package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overrides extends StObject {
  
  var overrides: js.UndefOr[LabelInteractable] = js.undefined
}
object Overrides {
  
  inline def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: LabelInteractable): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}

package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var closeSource: js.UndefOr[typings.baseui.modalTypesMod.CloseSource] = js.undefined
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setCloseSource(value: typings.baseui.modalTypesMod.CloseSource): Self = StObject.set(x, "closeSource", value.asInstanceOf[js.Any])
    
    inline def setCloseSourceUndefined: Self = StObject.set(x, "closeSource", js.undefined)
  }
}

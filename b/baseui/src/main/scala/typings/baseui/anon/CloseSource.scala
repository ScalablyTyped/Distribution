package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSource extends StObject {
  
  var closeSource: js.UndefOr[typings.baseui.drawerTypesMod.CloseSource] = js.undefined
}
object CloseSource {
  
  inline def apply(): CloseSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseSource] (val x: Self) extends AnyVal {
    
    inline def setCloseSource(value: typings.baseui.drawerTypesMod.CloseSource): Self = StObject.set(x, "closeSource", value.asInstanceOf[js.Any])
    
    inline def setCloseSourceUndefined: Self = StObject.set(x, "closeSource", js.undefined)
  }
}

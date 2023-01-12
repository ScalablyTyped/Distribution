package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontMgrFactory extends StObject {
  
  /**
    * Create an FontMgr with the created font data. Returns null if buffers was empty.
    * @param buffers
    */
  def FromData(buffers: js.typedarray.ArrayBuffer*): FontMgr | Null
}
object FontMgrFactory {
  
  inline def apply(FromData: /* repeated */ js.typedarray.ArrayBuffer => FontMgr | Null): FontMgrFactory = {
    val __obj = js.Dynamic.literal(FromData = js.Any.fromFunction1(FromData))
    __obj.asInstanceOf[FontMgrFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontMgrFactory] (val x: Self) extends AnyVal {
    
    inline def setFromData(value: /* repeated */ js.typedarray.ArrayBuffer => FontMgr | Null): Self = StObject.set(x, "FromData", js.Any.fromFunction1(value))
  }
}

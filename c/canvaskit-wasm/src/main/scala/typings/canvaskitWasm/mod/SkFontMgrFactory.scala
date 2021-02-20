package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkFontMgrFactory extends StObject {
  
  /**
    * Create an SkFontMgr with the created font data. Returns null if buffers was empty.
    * @param buffers
    */
  def FromData(buffers: ArrayBuffer*): SkFontMgr | Null = js.native
  
  /**
    * Return the default SkFontMgr. This will generally have 0 or 1 fonts in it, depending on if
    * the demo monospace font was compiled in.
    */
  def RefDefault(): SkFontMgr = js.native
}
object SkFontMgrFactory {
  
  @scala.inline
  def apply(FromData: /* repeated */ ArrayBuffer => SkFontMgr | Null, RefDefault: () => SkFontMgr): SkFontMgrFactory = {
    val __obj = js.Dynamic.literal(FromData = js.Any.fromFunction1(FromData), RefDefault = js.Any.fromFunction0(RefDefault))
    __obj.asInstanceOf[SkFontMgrFactory]
  }
  
  @scala.inline
  implicit class SkFontMgrFactoryMutableBuilder[Self <: SkFontMgrFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromData(value: /* repeated */ ArrayBuffer => SkFontMgr | Null): Self = StObject.set(x, "FromData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefDefault(value: () => SkFontMgr): Self = StObject.set(x, "RefDefault", js.Any.fromFunction0(value))
  }
}

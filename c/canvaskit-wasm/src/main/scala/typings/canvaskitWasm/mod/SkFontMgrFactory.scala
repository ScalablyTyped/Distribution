package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkFontMgrFactory extends js.Object {
  
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
  implicit class SkFontMgrFactoryOps[Self <: SkFontMgrFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromData(value: /* repeated */ ArrayBuffer => SkFontMgr | Null): Self = this.set("FromData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefDefault(value: () => SkFontMgr): Self = this.set("RefDefault", js.Any.fromFunction0(value))
  }
}

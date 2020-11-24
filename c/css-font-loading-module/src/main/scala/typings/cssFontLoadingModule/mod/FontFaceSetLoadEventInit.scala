package typings.cssFontLoadingModule.mod

import typings.cssFontLoadingModule.mod.global.FontFace
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceSetLoadEventInit extends EventInit {
  
  var fontfaces: js.UndefOr[js.Array[FontFace]] = js.native
}
object FontFaceSetLoadEventInit {
  
  @scala.inline
  def apply(): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
  
  @scala.inline
  implicit class FontFaceSetLoadEventInitOps[Self <: FontFaceSetLoadEventInit] (val x: Self) extends AnyVal {
    
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
    def setFontfacesVarargs(value: FontFace*): Self = this.set("fontfaces", js.Array(value :_*))
    
    @scala.inline
    def setFontfaces(value: js.Array[FontFace]): Self = this.set("fontfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontfaces: Self = this.set("fontfaces", js.undefined)
  }
}

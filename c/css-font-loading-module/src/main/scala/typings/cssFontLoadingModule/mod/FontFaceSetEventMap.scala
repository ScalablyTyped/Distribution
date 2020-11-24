package typings.cssFontLoadingModule.mod

import typings.cssFontLoadingModule.mod.global.FontFaceSetLoadEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceSetEventMap extends js.Object {
  
  def loading(event: FontFaceSetLoadEvent): js.Any = js.native
  
  def loadingdone(event: FontFaceSetLoadEvent): js.Any = js.native
  
  def loadingerror(event: FontFaceSetLoadEvent): js.Any = js.native
}
object FontFaceSetEventMap {
  
  @scala.inline
  def apply(
    loading: FontFaceSetLoadEvent => js.Any,
    loadingdone: FontFaceSetLoadEvent => js.Any,
    loadingerror: FontFaceSetLoadEvent => js.Any
  ): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = js.Any.fromFunction1(loading), loadingdone = js.Any.fromFunction1(loadingdone), loadingerror = js.Any.fromFunction1(loadingerror))
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
  
  @scala.inline
  implicit class FontFaceSetEventMapOps[Self <: FontFaceSetEventMap] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: FontFaceSetLoadEvent => js.Any): Self = this.set("loading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadingdone(value: FontFaceSetLoadEvent => js.Any): Self = this.set("loadingdone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadingerror(value: FontFaceSetLoadEvent => js.Any): Self = this.set("loadingerror", js.Any.fromFunction1(value))
  }
}

package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalCityOptions extends js.Object {
  
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}
object LocalCityOptions {
  
  @scala.inline
  def apply(): LocalCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalCityOptions]
  }
  
  @scala.inline
  implicit class LocalCityOptionsOps[Self <: LocalCityOptions] (val x: Self) extends AnyVal {
    
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
    def setRenderOptions(value: RenderOptions): Self = this.set("renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderOptions: Self = this.set("renderOptions", js.undefined)
  }
}

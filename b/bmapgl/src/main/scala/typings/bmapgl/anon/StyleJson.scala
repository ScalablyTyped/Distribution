package typings.bmapgl.anon

import typings.bmapgl.BMapGL.MapStyleItem
import typings.bmapgl.BMapGL.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleJson extends MapStyleV2 {
  
  var styleJson: js.Array[MapStyleItem] = js.native
}
object StyleJson {
  
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleJson]
  }
  
  @scala.inline
  implicit class StyleJsonOps[Self <: StyleJson] (val x: Self) extends AnyVal {
    
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
    def setStyleJsonVarargs(value: MapStyleItem*): Self = this.set("styleJson", js.Array(value :_*))
    
    @scala.inline
    def setStyleJson(value: js.Array[MapStyleItem]): Self = this.set("styleJson", value.asInstanceOf[js.Any])
  }
}

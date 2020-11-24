package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStyle extends js.Object {
  
  var features: js.Array[_] = js.native
  
  var style: String = js.native
}
object MapStyle {
  
  @scala.inline
  def apply(features: js.Array[_], style: String): MapStyle = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyle]
  }
  
  @scala.inline
  implicit class MapStyleOps[Self <: MapStyle] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: js.Any*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[_]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}

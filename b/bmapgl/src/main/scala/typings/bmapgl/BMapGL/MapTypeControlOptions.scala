package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeControlOptions extends js.Object {
  
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.native
  
  var `type`: js.UndefOr[MapTypeControlType] = js.native
}
object MapTypeControlOptions {
  
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
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
    def setMapTypesVarargs(value: MapType*): Self = this.set("mapTypes", js.Array(value :_*))
    
    @scala.inline
    def setMapTypes(value: js.Array[MapType]): Self = this.set("mapTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapTypes: Self = this.set("mapTypes", js.undefined)
    
    @scala.inline
    def setType(value: MapTypeControlType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

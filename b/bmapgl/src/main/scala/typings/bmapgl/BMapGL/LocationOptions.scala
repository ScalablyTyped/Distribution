package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends js.Object {
  
  var numPois: js.UndefOr[Double] = js.native
  
  var poiRadius: js.UndefOr[Double] = js.native
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
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
    def setNumPois(value: Double): Self = this.set("numPois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumPois: Self = this.set("numPois", js.undefined)
    
    @scala.inline
    def setPoiRadius(value: Double): Self = this.set("poiRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoiRadius: Self = this.set("poiRadius", js.undefined)
  }
}

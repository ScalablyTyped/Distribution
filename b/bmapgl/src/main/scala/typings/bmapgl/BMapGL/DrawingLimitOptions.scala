package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingLimitOptions extends js.Object {
  
  var area: js.UndefOr[Double] = js.native
  
  var distance: js.UndefOr[Double] = js.native
}
object DrawingLimitOptions {
  
  @scala.inline
  def apply(): DrawingLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingLimitOptions]
  }
  
  @scala.inline
  implicit class DrawingLimitOptionsOps[Self <: DrawingLimitOptions] (val x: Self) extends AnyVal {
    
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
    def setArea(value: Double): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
  }
}

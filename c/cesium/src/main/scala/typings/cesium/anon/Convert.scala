package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends js.Object {
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var destination: js.UndefOr[Cartesian3 | typings.cesium.mod.Rectangle] = js.native
  
  var endTransform: js.UndefOr[Matrix4] = js.native
  
  var orientation: js.UndefOr[Direction | Heading] = js.native
}
object Convert {
  
  @scala.inline
  def apply(): Convert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Convert]
  }
  
  @scala.inline
  implicit class ConvertOps[Self <: Convert] (val x: Self) extends AnyVal {
    
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
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setDestination(value: Cartesian3 | typings.cesium.mod.Rectangle): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setEndTransform(value: Matrix4): Self = this.set("endTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTransform: Self = this.set("endTransform", js.undefined)
    
    @scala.inline
    def setOrientation(value: Direction | Heading): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}

package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setHeight()
@js.native
trait SetHeightConfig extends js.Object {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var fullViewport: js.UndefOr[Boolean] = js.native
  
  var growOnly: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
}
object SetHeightConfig {
  
  @scala.inline
  def apply(height: Double): SetHeightConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHeightConfig]
  }
  
  @scala.inline
  implicit class SetHeightConfigOps[Self <: SetHeightConfig] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setFullViewport(value: Boolean): Self = this.set("fullViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullViewport: Self = this.set("fullViewport", js.undefined)
    
    @scala.inline
    def setGrowOnly(value: Boolean): Self = this.set("growOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowOnly: Self = this.set("growOnly", js.undefined)
  }
}

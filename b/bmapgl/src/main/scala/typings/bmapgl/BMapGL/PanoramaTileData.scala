package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaTileData extends js.Object {
  
  var centerHeading: Double = js.native
  
  var tileSize: Size = js.native
  
  var worldSize: Size = js.native
}
object PanoramaTileData {
  
  @scala.inline
  def apply(centerHeading: Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaTileData]
  }
  
  @scala.inline
  implicit class PanoramaTileDataOps[Self <: PanoramaTileData] (val x: Self) extends AnyVal {
    
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
    def setCenterHeading(value: Double): Self = this.set("centerHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldSize(value: Size): Self = this.set("worldSize", value.asInstanceOf[js.Any])
  }
}

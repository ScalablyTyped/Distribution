package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClampToGroundEllipsoid extends js.Object {
  
  var clampToGround: js.UndefOr[Boolean] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var sourceUri: js.UndefOr[String] = js.native
}
object ClampToGroundEllipsoid {
  
  @scala.inline
  def apply(): ClampToGroundEllipsoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGroundEllipsoid]
  }
  
  @scala.inline
  implicit class ClampToGroundEllipsoidOps[Self <: ClampToGroundEllipsoid] (val x: Self) extends AnyVal {
    
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
    def setClampToGround(value: Boolean): Self = this.set("clampToGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClampToGround: Self = this.set("clampToGround", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
  }
}

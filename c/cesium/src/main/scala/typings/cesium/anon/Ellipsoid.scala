package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipsoid extends js.Object {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.native
  
  var requestVertexNormals: js.UndefOr[Boolean] = js.native
  
  var requestWaterMask: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object Ellipsoid {
  
  @scala.inline
  def apply(url: String): Ellipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsoid]
  }
  
  @scala.inline
  implicit class EllipsoidOps[Self <: Ellipsoid] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRequestVertexNormals(value: Boolean): Self = this.set("requestVertexNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestVertexNormals: Self = this.set("requestVertexNormals", js.undefined)
    
    @scala.inline
    def setRequestWaterMask(value: Boolean): Self = this.set("requestWaterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestWaterMask: Self = this.set("requestWaterMask", js.undefined)
  }
}

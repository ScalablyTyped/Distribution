package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Updatable extends js.Object {
  
  var precision: js.UndefOr[H] = js.native
  
  var subdivisions: js.UndefOr[H] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var xmax: Double = js.native
  
  var xmin: Double = js.native
  
  var zmax: Double = js.native
  
  var zmin: Double = js.native
}
object Updatable {
  
  @scala.inline
  def apply(xmax: Double, xmin: Double, zmax: Double, zmin: Double): Updatable = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updatable]
  }
  
  @scala.inline
  implicit class UpdatableOps[Self <: Updatable] (val x: Self) extends AnyVal {
    
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
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmax(value: Double): Self = this.set("zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmin(value: Double): Self = this.set("zmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: H): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: H): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
  }
}

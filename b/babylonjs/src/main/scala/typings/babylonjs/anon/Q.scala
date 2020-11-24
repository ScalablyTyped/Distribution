package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Q extends js.Object {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var p: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[Double] = js.native
  
  var radialSegments: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tube: js.UndefOr[Double] = js.native
  
  var tubularSegments: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object Q {
  
  @scala.inline
  def apply(): Q = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Q]
  }
  
  @scala.inline
  implicit class QOps[Self <: Q] (val x: Self) extends AnyVal {
    
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
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    
    @scala.inline
    def setQ(value: Double): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setRadialSegments(value: Double): Self = this.set("radialSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialSegments: Self = this.set("radialSegments", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setTube(value: Double): Self = this.set("tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTube: Self = this.set("tube", js.undefined)
    
    @scala.inline
    def setTubularSegments(value: Double): Self = this.set("tubularSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTubularSegments: Self = this.set("tubularSegments", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
  }
}

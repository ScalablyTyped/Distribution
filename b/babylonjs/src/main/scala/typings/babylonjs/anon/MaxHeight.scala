package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color3
import typings.babylonjs.BABYLON.GroundMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxHeight extends js.Object {
  
  var alphaFilter: js.UndefOr[Double] = js.native
  
  var colorFilter: js.UndefOr[Color3] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var onReady: js.UndefOr[js.Function1[/* mesh */ GroundMesh, Unit]] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MaxHeight {
  
  @scala.inline
  def apply(): MaxHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeight]
  }
  
  @scala.inline
  implicit class MaxHeightOps[Self <: MaxHeight] (val x: Self) extends AnyVal {
    
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
    def setAlphaFilter(value: Double): Self = this.set("alphaFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaFilter: Self = this.set("alphaFilter", js.undefined)
    
    @scala.inline
    def setColorFilter(value: Color3): Self = this.set("colorFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorFilter: Self = this.set("colorFilter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* mesh */ GroundMesh => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

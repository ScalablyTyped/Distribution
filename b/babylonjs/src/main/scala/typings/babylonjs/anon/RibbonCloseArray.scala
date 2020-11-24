package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RibbonCloseArray extends js.Object {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var cap: js.UndefOr[Double] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var instance: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var path: js.Array[Vector3] = js.native
  
  var ribbonCloseArray: js.UndefOr[Boolean] = js.native
  
  var ribbonClosePath: js.UndefOr[Boolean] = js.native
  
  var rotationFunction: js.UndefOr[js.Any] = js.native
  
  var scaleFunction: js.UndefOr[js.Any] = js.native
  
  var shape: js.Array[Vector3] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object RibbonCloseArray {
  
  @scala.inline
  def apply(path: js.Array[Vector3], shape: js.Array[Vector3]): RibbonCloseArray = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonCloseArray]
  }
  
  @scala.inline
  implicit class RibbonCloseArrayOps[Self <: RibbonCloseArray] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: Vector3*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Vector3]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Vector3*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Vector3]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setCap(value: Double): Self = this.set("cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setInstance(value: typings.babylonjs.BABYLON.Mesh): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = this.set("invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertUV: Self = this.set("invertUV", js.undefined)
    
    @scala.inline
    def setRibbonCloseArray(value: Boolean): Self = this.set("ribbonCloseArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRibbonCloseArray: Self = this.set("ribbonCloseArray", js.undefined)
    
    @scala.inline
    def setRibbonClosePath(value: Boolean): Self = this.set("ribbonClosePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRibbonClosePath: Self = this.set("ribbonClosePath", js.undefined)
    
    @scala.inline
    def setRotationFunction(value: js.Any): Self = this.set("rotationFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationFunction: Self = this.set("rotationFunction", js.undefined)
    
    @scala.inline
    def setScaleFunction(value: js.Any): Self = this.set("scaleFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFunction: Self = this.set("scaleFunction", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
  }
}

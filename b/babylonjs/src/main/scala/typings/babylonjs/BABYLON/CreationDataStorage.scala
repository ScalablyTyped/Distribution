package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreationDataStorage extends js.Object {
  
  var arc: Double = js.native
  
  var cap: Double = js.native
  
  var closeArray: js.UndefOr[Boolean] = js.native
  
  var closePath: js.UndefOr[Boolean] = js.native
  
  var dashSize: Double = js.native
  
  var gapSize: Double = js.native
  
  var idx: js.Array[Double] = js.native
  
  var path3D: Path3D = js.native
  
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  
  var radius: Double = js.native
  
  var tessellation: Double = js.native
}
object CreationDataStorage {
  
  @scala.inline
  def apply(
    arc: Double,
    cap: Double,
    dashSize: Double,
    gapSize: Double,
    idx: js.Array[Double],
    path3D: Path3D,
    pathArray: js.Array[js.Array[Vector3]],
    radius: Double,
    tessellation: Double
  ): CreationDataStorage = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], dashSize = dashSize.asInstanceOf[js.Any], gapSize = gapSize.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], path3D = path3D.asInstanceOf[js.Any], pathArray = pathArray.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDataStorage]
  }
  
  @scala.inline
  implicit class CreationDataStorageOps[Self <: CreationDataStorage] (val x: Self) extends AnyVal {
    
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
    def setArc(value: Double): Self = this.set("arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCap(value: Double): Self = this.set("cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashSize(value: Double): Self = this.set("dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSize(value: Double): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdxVarargs(value: Double*): Self = this.set("idx", js.Array(value :_*))
    
    @scala.inline
    def setIdx(value: js.Array[Double]): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath3D(value: Path3D): Self = this.set("path3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathArrayVarargs(value: js.Array[Vector3]*): Self = this.set("pathArray", js.Array(value :_*))
    
    @scala.inline
    def setPathArray(value: js.Array[js.Array[Vector3]]): Self = this.set("pathArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellation(value: Double): Self = this.set("tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseArray(value: Boolean): Self = this.set("closeArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseArray: Self = this.set("closeArray", js.undefined)
    
    @scala.inline
    def setClosePath(value: Boolean): Self = this.set("closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosePath: Self = this.set("closePath", js.undefined)
  }
}

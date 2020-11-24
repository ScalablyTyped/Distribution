package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonMapShaderOptions extends js.Object {
  
  /** Array of ColorMapKnots that make the gradient must be ordered with knot[i].location < knot[i+1].location*/
  var colorMap: js.UndefOr[js.Array[ISkeletonMapShaderColorMapKnot]] = js.native
  
  /** Skeleton to Map */
  var skeleton: Skeleton = js.native
}
object ISkeletonMapShaderOptions {
  
  @scala.inline
  def apply(skeleton: Skeleton): ISkeletonMapShaderOptions = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkeletonMapShaderOptions]
  }
  
  @scala.inline
  implicit class ISkeletonMapShaderOptionsOps[Self <: ISkeletonMapShaderOptions] (val x: Self) extends AnyVal {
    
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
    def setSkeleton(value: Skeleton): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMapVarargs(value: ISkeletonMapShaderColorMapKnot*): Self = this.set("colorMap", js.Array(value :_*))
    
    @scala.inline
    def setColorMap(value: js.Array[ISkeletonMapShaderColorMapKnot]): Self = this.set("colorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMap: Self = this.set("colorMap", js.undefined)
  }
}

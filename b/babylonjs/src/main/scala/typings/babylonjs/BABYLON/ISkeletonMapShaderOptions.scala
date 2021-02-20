package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkeletonMapShaderOptions extends StObject {
  
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
  implicit class ISkeletonMapShaderOptionsMutableBuilder[Self <: ISkeletonMapShaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorMap(value: js.Array[ISkeletonMapShaderColorMapKnot]): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
    
    @scala.inline
    def setColorMapVarargs(value: ISkeletonMapShaderColorMapKnot*): Self = StObject.set(x, "colorMap", js.Array(value :_*))
    
    @scala.inline
    def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
  }
}

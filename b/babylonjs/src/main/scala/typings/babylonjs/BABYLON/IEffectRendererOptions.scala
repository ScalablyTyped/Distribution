package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectRendererOptions extends js.Object {
  
  /**
    * Defines the indices.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Defines the vertices positions.
    */
  var positions: js.UndefOr[js.Array[Double]] = js.native
}
object IEffectRendererOptions {
  
  @scala.inline
  def apply(): IEffectRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEffectRendererOptions]
  }
  
  @scala.inline
  implicit class IEffectRendererOptionsOps[Self <: IEffectRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
  }
}

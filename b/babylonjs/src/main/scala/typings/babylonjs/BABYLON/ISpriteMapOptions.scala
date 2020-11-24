package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteMapOptions extends js.Object {
  
  /**
    * number cell index of the base tile when the system compiles.
    */
  var baseTile: js.UndefOr[Double] = js.native
  
  /**
    * Vector3 scalar of the global RGB values of the SpriteMap.
    */
  var colorMultiply: js.UndefOr[Vector3] = js.native
  
  /**
    * boolean flip the sprite after its been repositioned by the framing data.
    */
  var flipU: js.UndefOr[Boolean] = js.native
  
  /**
    * number of layers that the system will reserve in resources.
    */
  var layerCount: js.UndefOr[Double] = js.native
  
  /**
    * number of max animation frames a single cell will reserve in resources.
    */
  var maxAnimationFrames: js.UndefOr[Double] = js.native
  
  /**
    * Vector3 of the position of the output plane in World Units.
    */
  var outputPosition: js.UndefOr[Vector3] = js.native
  
  /**
    * Vector3 of the rotation of the output plane.
    */
  var outputRotation: js.UndefOr[Vector3] = js.native
  
  /**
    * Vector2 of the size of the output plane in World Units.
    */
  var outputSize: js.UndefOr[Vector2] = js.native
  
  /**
    * Vector2 of the number of cells in the grid.
    */
  var stageSize: js.UndefOr[Vector2] = js.native
}
object ISpriteMapOptions {
  
  @scala.inline
  def apply(): ISpriteMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteMapOptions]
  }
  
  @scala.inline
  implicit class ISpriteMapOptionsOps[Self <: ISpriteMapOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseTile(value: Double): Self = this.set("baseTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTile: Self = this.set("baseTile", js.undefined)
    
    @scala.inline
    def setColorMultiply(value: Vector3): Self = this.set("colorMultiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMultiply: Self = this.set("colorMultiply", js.undefined)
    
    @scala.inline
    def setFlipU(value: Boolean): Self = this.set("flipU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipU: Self = this.set("flipU", js.undefined)
    
    @scala.inline
    def setLayerCount(value: Double): Self = this.set("layerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerCount: Self = this.set("layerCount", js.undefined)
    
    @scala.inline
    def setMaxAnimationFrames(value: Double): Self = this.set("maxAnimationFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAnimationFrames: Self = this.set("maxAnimationFrames", js.undefined)
    
    @scala.inline
    def setOutputPosition(value: Vector3): Self = this.set("outputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPosition: Self = this.set("outputPosition", js.undefined)
    
    @scala.inline
    def setOutputRotation(value: Vector3): Self = this.set("outputRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputRotation: Self = this.set("outputRotation", js.undefined)
    
    @scala.inline
    def setOutputSize(value: Vector2): Self = this.set("outputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSize: Self = this.set("outputSize", js.undefined)
    
    @scala.inline
    def setStageSize(value: Vector2): Self = this.set("stageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageSize: Self = this.set("stageSize", js.undefined)
  }
}

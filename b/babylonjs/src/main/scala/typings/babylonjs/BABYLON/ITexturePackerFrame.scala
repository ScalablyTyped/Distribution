package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITexturePackerFrame extends StObject {
  
  /**
    * The frame ID
    */
  var id: Double = js.native
  
  /**
    * The Frames offset
    */
  var offset: Vector2 = js.native
  
  /**
    * The frames Scale
    */
  var scale: Vector2 = js.native
}
object ITexturePackerFrame {
  
  @scala.inline
  def apply(id: Double, offset: Vector2, scale: Vector2): ITexturePackerFrame = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerFrame]
  }
  
  @scala.inline
  implicit class ITexturePackerFrameMutableBuilder[Self <: ITexturePackerFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Vector2): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}

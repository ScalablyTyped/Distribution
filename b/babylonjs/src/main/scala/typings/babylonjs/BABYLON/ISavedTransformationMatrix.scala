package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait ISavedTransformationMatrix extends StObject {
  
  var viewProjection: Matrix = js.native
  
  var world: Matrix = js.native
}
object ISavedTransformationMatrix {
  
  @scala.inline
  def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
    val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedTransformationMatrix]
  }
  
  @scala.inline
  implicit class ISavedTransformationMatrixMutableBuilder[Self <: ISavedTransformationMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewProjection(value: Matrix): Self = StObject.set(x, "viewProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorld(value: Matrix): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}

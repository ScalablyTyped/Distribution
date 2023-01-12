package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait ISavedTransformationMatrix extends StObject {
  
  var viewProjection: Matrix
  
  var world: Matrix
}
object ISavedTransformationMatrix {
  
  inline def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
    val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedTransformationMatrix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISavedTransformationMatrix] (val x: Self) extends AnyVal {
    
    inline def setViewProjection(value: Matrix): Self = StObject.set(x, "viewProjection", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: Matrix): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}

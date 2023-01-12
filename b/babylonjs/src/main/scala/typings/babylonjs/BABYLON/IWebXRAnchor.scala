package typings.babylonjs.BABYLON

import typings.babylonjs.XRAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRAnchor extends StObject {
  
  /**
    * if defined, this object will be constantly updated by the anchor's position and rotation
    */
  var attachedNode: js.UndefOr[TransformNode] = js.undefined
  
  /**
    * A babylon-assigned ID for this anchor
    */
  var id: Double
  
  /**
    * Remove this anchor from the scene
    */
  def remove(): Unit
  
  /**
    * Transformation matrix to apply to an object attached to this anchor
    */
  var transformationMatrix: Matrix
  
  /**
    * The native anchor object
    */
  var xrAnchor: XRAnchor
}
object IWebXRAnchor {
  
  inline def apply(id: Double, remove: () => Unit, transformationMatrix: Matrix, xrAnchor: XRAnchor): IWebXRAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrAnchor = xrAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRAnchor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRAnchor] (val x: Self) extends AnyVal {
    
    inline def setAttachedNode(value: TransformNode): Self = StObject.set(x, "attachedNode", value.asInstanceOf[js.Any])
    
    inline def setAttachedNodeUndefined: Self = StObject.set(x, "attachedNode", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
    
    inline def setXrAnchor(value: XRAnchor): Self = StObject.set(x, "xrAnchor", value.asInstanceOf[js.Any])
  }
}

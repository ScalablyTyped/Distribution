package typings.babylonjs.BABYLON

import typings.babylonjs.XRAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRAnchor extends StObject {
  
  /**
    * if defined, this object will be constantly updated by the anchor's position and rotation
    */
  var attachedNode: js.UndefOr[TransformNode] = js.native
  
  /**
    * A babylon-assigned ID for this anchor
    */
  var id: Double = js.native
  
  /**
    * Remove this anchor from the scene
    */
  def remove(): Unit = js.native
  
  /**
    * Transformation matrix to apply to an object attached to this anchor
    */
  var transformationMatrix: Matrix = js.native
  
  /**
    * The native anchor object
    */
  var xrAnchor: XRAnchor = js.native
}
object IWebXRAnchor {
  
  @scala.inline
  def apply(id: Double, remove: () => Unit, transformationMatrix: Matrix, xrAnchor: XRAnchor): IWebXRAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrAnchor = xrAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRAnchor]
  }
  
  @scala.inline
  implicit class IWebXRAnchorMutableBuilder[Self <: IWebXRAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedNode(value: TransformNode): Self = StObject.set(x, "attachedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedNodeUndefined: Self = StObject.set(x, "attachedNode", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrAnchor(value: XRAnchor): Self = StObject.set(x, "xrAnchor", value.asInstanceOf[js.Any])
  }
}

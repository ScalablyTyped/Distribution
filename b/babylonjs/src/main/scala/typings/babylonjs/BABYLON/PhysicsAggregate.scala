package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsAggregate extends StObject {
  
  /* private */ var _addSizeOptions: Any
  
  /* private */ var _disposeShapeWhenDisposed: Any
  
  /* private */ var _getObjectBoundingBox: Any
  
  /* private */ var _nodeDisposeObserver: Any
  
  /* private */ var _options: Any
  
  /* private */ var _scene: Any
  
  /**
    * The body that is associated with this aggregate
    */
  var body: PhysicsBody
  
  /**
    * Releases the body, shape and material
    */
  def dispose(): Unit
  
  /**
    * The material that is associated with this aggregate
    */
  var material: PhysicsMaterial
  
  /**
    * The shape that is associated with this aggregate
    */
  var shape: PhysicsShape
  
  /**
    * The physics-enabled object used as the physics aggregate
    */
  var transformNode: TransformNode
  
  /**
    * The type of the physics aggregate
    */
  var `type`: PhysicsShapeType | PhysicsShape
}
object PhysicsAggregate {
  
  inline def apply(
    _addSizeOptions: Any,
    _disposeShapeWhenDisposed: Any,
    _getObjectBoundingBox: Any,
    _nodeDisposeObserver: Any,
    _options: Any,
    _scene: Any,
    body: PhysicsBody,
    dispose: () => Unit,
    material: PhysicsMaterial,
    shape: PhysicsShape,
    transformNode: TransformNode,
    `type`: PhysicsShapeType | PhysicsShape
  ): PhysicsAggregate = {
    val __obj = js.Dynamic.literal(_addSizeOptions = _addSizeOptions.asInstanceOf[js.Any], _disposeShapeWhenDisposed = _disposeShapeWhenDisposed.asInstanceOf[js.Any], _getObjectBoundingBox = _getObjectBoundingBox.asInstanceOf[js.Any], _nodeDisposeObserver = _nodeDisposeObserver.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), material = material.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], transformNode = transformNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsAggregate] (val x: Self) extends AnyVal {
    
    inline def setBody(value: PhysicsBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setMaterial(value: PhysicsMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setShape(value: PhysicsShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setTransformNode(value: TransformNode): Self = StObject.set(x, "transformNode", value.asInstanceOf[js.Any])
    
    inline def setType(value: PhysicsShapeType | PhysicsShape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_addSizeOptions(value: Any): Self = StObject.set(x, "_addSizeOptions", value.asInstanceOf[js.Any])
    
    inline def set_disposeShapeWhenDisposed(value: Any): Self = StObject.set(x, "_disposeShapeWhenDisposed", value.asInstanceOf[js.Any])
    
    inline def set_getObjectBoundingBox(value: Any): Self = StObject.set(x, "_getObjectBoundingBox", value.asInstanceOf[js.Any])
    
    inline def set_nodeDisposeObserver(value: Any): Self = StObject.set(x, "_nodeDisposeObserver", value.asInstanceOf[js.Any])
    
    inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}

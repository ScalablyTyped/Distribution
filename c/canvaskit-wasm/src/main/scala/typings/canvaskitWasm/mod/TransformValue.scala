package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformValue extends StObject {
  
  /**
    * Anchor point for transform. x and y value.
    */
  var anchor: js.typedarray.Float32Array
  
  /**
    * Position of transform. x and y value.
    */
  var position: js.typedarray.Float32Array
  
  /**
    * Rotation of transform in degrees.
    */
  var rotation: Double
  
  /**
    * Scale of transform. x and y value.
    */
  var scale: js.typedarray.Float32Array
  
  /**
    * Skew to apply during transform.
    */
  var skew: Double
  
  /**
    * Direction of skew in degrees.
    */
  var skew_axis: Double
}
object TransformValue {
  
  inline def apply(
    anchor: js.typedarray.Float32Array,
    position: js.typedarray.Float32Array,
    rotation: Double,
    scale: js.typedarray.Float32Array,
    skew: Double,
    skew_axis: Double
  ): TransformValue = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any], skew_axis = skew_axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformValue] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: js.typedarray.Float32Array): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.typedarray.Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: js.typedarray.Float32Array): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkew_axis(value: Double): Self = StObject.set(x, "skew_axis", value.asInstanceOf[js.Any])
  }
}

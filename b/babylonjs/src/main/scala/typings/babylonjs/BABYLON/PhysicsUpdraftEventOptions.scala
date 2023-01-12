package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsUpdraftEventOptions extends StObject {
  
  /**
    * The height of the cylinder for the updraft.
    */
  var height: Double
  
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double
  
  /**
    * The strength of the updraft.
    */
  var strength: Double
  
  /**
    * The mode for the the updraft.
    */
  var updraftMode: PhysicsUpdraftMode
}
object PhysicsUpdraftEventOptions {
  
  inline def apply(height: Double, radius: Double, strength: Double, updraftMode: PhysicsUpdraftMode): PhysicsUpdraftEventOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], updraftMode = updraftMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsUpdraftEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsUpdraftEventOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setUpdraftMode(value: PhysicsUpdraftMode): Self = StObject.set(x, "updraftMode", value.asInstanceOf[js.Any])
  }
}

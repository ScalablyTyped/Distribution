package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the size containing width and height
  */
@js.native
trait IXYZ extends StObject {
  
  /**
    * X
    */
  var x: Double = js.native
  
  /**
    * Y
    */
  var y: Double = js.native
  
  /**
    * Z
    */
  var z: Double = js.native
}
object IXYZ {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): IXYZ = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXYZ]
  }
  
  @scala.inline
  implicit class IXYZMutableBuilder[Self <: IXYZ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}

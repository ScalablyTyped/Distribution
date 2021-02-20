package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends StObject {
  
  var boundingSphereRadius: Double = js.native
  
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3 = js.native
  
  var collisionResponse: Boolean = js.native
  
  var `type`: Double = js.native
  
  def updateBoundingSphereRadius(): Double = js.native
  
  def volume(): Double = js.native
}
object Shape {
  
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double
  ): Shape = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingSphereRadius(value: Double): Self = StObject.set(x, "boundingSphereRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateLocalInertia(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "calculateLocalInertia", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = StObject.set(x, "collisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBoundingSphereRadius(value: () => Double): Self = StObject.set(x, "updateBoundingSphereRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVolume(value: () => Double): Self = StObject.set(x, "volume", js.Any.fromFunction0(value))
  }
}

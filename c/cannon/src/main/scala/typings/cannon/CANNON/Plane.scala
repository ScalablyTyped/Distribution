package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plane
  extends StObject
     with Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Double, max: Double): Unit
  
  def computeWorldNormal(quat: Quaternion): Unit
  
  var worldNormal: Vec3
  
  var worldNormalNeedsUpdate: Boolean
}
object Plane {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Double, Double) => Unit,
    collisionResponse: Boolean,
    computeWorldNormal: Quaternion => Unit,
    id: Double,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double,
    worldNormal: Vec3,
    worldNormalNeedsUpdate: Boolean
  ): Plane = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeWorldNormal = js.Any.fromFunction1(computeWorldNormal), id = id.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume), worldNormal = worldNormal.asInstanceOf[js.Any], worldNormalNeedsUpdate = worldNormalNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plane]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plane] (val x: Self) extends AnyVal {
    
    inline def setCalculateWorldAABB(value: (Vec3, Quaternion, Double, Double) => Unit): Self = StObject.set(x, "calculateWorldAABB", js.Any.fromFunction4(value))
    
    inline def setComputeWorldNormal(value: Quaternion => Unit): Self = StObject.set(x, "computeWorldNormal", js.Any.fromFunction1(value))
    
    inline def setWorldNormal(value: Vec3): Self = StObject.set(x, "worldNormal", value.asInstanceOf[js.Any])
    
    inline def setWorldNormalNeedsUpdate(value: Boolean): Self = StObject.set(x, "worldNormalNeedsUpdate", value.asInstanceOf[js.Any])
  }
}

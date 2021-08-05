package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBodyOptions extends StObject {
  
  var allowSleep: js.UndefOr[Boolean] = js.undefined
  
  var angularDamping: js.UndefOr[Double] = js.undefined
  
  var angularVelocity: js.UndefOr[Vec3] = js.undefined
  
  var collisionFilterGroup: js.UndefOr[Double] = js.undefined
  
  var collisionFilterMask: js.UndefOr[Double] = js.undefined
  
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  
  var linearDamping: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var material: js.UndefOr[Material] = js.undefined
  
  var position: js.UndefOr[Vec3] = js.undefined
  
  var quaternion: js.UndefOr[Quaternion] = js.undefined
  
  var shape: js.UndefOr[Shape] = js.undefined
  
  var sleepSpeedLimit: js.UndefOr[Double] = js.undefined
  
  var sleepTimeLimit: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Vec3] = js.undefined
}
object IBodyOptions {
  
  inline def apply(): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyOptions]
  }
  
  extension [Self <: IBodyOptions](x: Self) {
    
    inline def setAllowSleep(value: Boolean): Self = StObject.set(x, "allowSleep", value.asInstanceOf[js.Any])
    
    inline def setAllowSleepUndefined: Self = StObject.set(x, "allowSleep", js.undefined)
    
    inline def setAngularDamping(value: Double): Self = StObject.set(x, "angularDamping", value.asInstanceOf[js.Any])
    
    inline def setAngularDampingUndefined: Self = StObject.set(x, "angularDamping", js.undefined)
    
    inline def setAngularVelocity(value: Vec3): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
    
    inline def setCollisionFilterGroup(value: Double): Self = StObject.set(x, "collisionFilterGroup", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilterGroupUndefined: Self = StObject.set(x, "collisionFilterGroup", js.undefined)
    
    inline def setCollisionFilterMask(value: Double): Self = StObject.set(x, "collisionFilterMask", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilterMaskUndefined: Self = StObject.set(x, "collisionFilterMask", js.undefined)
    
    inline def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    inline def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    inline def setLinearDamping(value: Double): Self = StObject.set(x, "linearDamping", value.asInstanceOf[js.Any])
    
    inline def setLinearDampingUndefined: Self = StObject.set(x, "linearDamping", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    inline def setQuaternionUndefined: Self = StObject.set(x, "quaternion", js.undefined)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSleepSpeedLimit(value: Double): Self = StObject.set(x, "sleepSpeedLimit", value.asInstanceOf[js.Any])
    
    inline def setSleepSpeedLimitUndefined: Self = StObject.set(x, "sleepSpeedLimit", js.undefined)
    
    inline def setSleepTimeLimit(value: Double): Self = StObject.set(x, "sleepTimeLimit", value.asInstanceOf[js.Any])
    
    inline def setSleepTimeLimitUndefined: Self = StObject.set(x, "sleepTimeLimit", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVelocity(value: Vec3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}

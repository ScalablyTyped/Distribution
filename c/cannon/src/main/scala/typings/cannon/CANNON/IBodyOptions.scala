package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBodyOptions extends StObject {
  
  var allowSleep: js.UndefOr[Boolean] = js.native
  
  var angularDamping: js.UndefOr[Double] = js.native
  
  var angularVelocity: js.UndefOr[Vec3] = js.native
  
  var collisionFilterGroup: js.UndefOr[Double] = js.native
  
  var collisionFilterMask: js.UndefOr[Double] = js.native
  
  var fixedRotation: js.UndefOr[Boolean] = js.native
  
  var linearDamping: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var material: js.UndefOr[Material] = js.native
  
  var position: js.UndefOr[Vec3] = js.native
  
  var quaternion: js.UndefOr[Quaternion] = js.native
  
  var shape: js.UndefOr[Shape] = js.native
  
  var sleepSpeedLimit: js.UndefOr[Double] = js.native
  
  var sleepTimeLimit: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Vec3] = js.native
}
object IBodyOptions {
  
  @scala.inline
  def apply(): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyOptions]
  }
  
  @scala.inline
  implicit class IBodyOptionsMutableBuilder[Self <: IBodyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSleep(value: Boolean): Self = StObject.set(x, "allowSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSleepUndefined: Self = StObject.set(x, "allowSleep", js.undefined)
    
    @scala.inline
    def setAngularDamping(value: Double): Self = StObject.set(x, "angularDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularDampingUndefined: Self = StObject.set(x, "angularDamping", js.undefined)
    
    @scala.inline
    def setAngularVelocity(value: Vec3): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
    
    @scala.inline
    def setCollisionFilterGroup(value: Double): Self = StObject.set(x, "collisionFilterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionFilterGroupUndefined: Self = StObject.set(x, "collisionFilterGroup", js.undefined)
    
    @scala.inline
    def setCollisionFilterMask(value: Double): Self = StObject.set(x, "collisionFilterMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionFilterMaskUndefined: Self = StObject.set(x, "collisionFilterMask", js.undefined)
    
    @scala.inline
    def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    @scala.inline
    def setLinearDamping(value: Double): Self = StObject.set(x, "linearDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearDampingUndefined: Self = StObject.set(x, "linearDamping", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuaternionUndefined: Self = StObject.set(x, "quaternion", js.undefined)
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSleepSpeedLimit(value: Double): Self = StObject.set(x, "sleepSpeedLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepSpeedLimitUndefined: Self = StObject.set(x, "sleepSpeedLimit", js.undefined)
    
    @scala.inline
    def setSleepTimeLimit(value: Double): Self = StObject.set(x, "sleepTimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepTimeLimitUndefined: Self = StObject.set(x, "sleepTimeLimit", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVelocity(value: Vec3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}

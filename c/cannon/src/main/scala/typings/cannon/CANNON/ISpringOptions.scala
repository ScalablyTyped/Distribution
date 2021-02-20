package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpringOptions extends StObject {
  
  var damping: js.UndefOr[Double] = js.native
  
  var localAnchorA: js.UndefOr[Vec3] = js.native
  
  var localAnchorB: js.UndefOr[Vec3] = js.native
  
  var restLength: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var worldAnchorA: js.UndefOr[Vec3] = js.native
  
  var worldAnchorB: js.UndefOr[Vec3] = js.native
}
object ISpringOptions {
  
  @scala.inline
  def apply(): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpringOptions]
  }
  
  @scala.inline
  implicit class ISpringOptionsMutableBuilder[Self <: ISpringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setLocalAnchorA(value: Vec3): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    @scala.inline
    def setLocalAnchorB(value: Vec3): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    @scala.inline
    def setRestLength(value: Double): Self = StObject.set(x, "restLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestLengthUndefined: Self = StObject.set(x, "restLength", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setWorldAnchorA(value: Vec3): Self = StObject.set(x, "worldAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldAnchorAUndefined: Self = StObject.set(x, "worldAnchorA", js.undefined)
    
    @scala.inline
    def setWorldAnchorB(value: Vec3): Self = StObject.set(x, "worldAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldAnchorBUndefined: Self = StObject.set(x, "worldAnchorB", js.undefined)
  }
}

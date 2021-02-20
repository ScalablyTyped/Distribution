package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpostorType extends StObject {
  
  var friction: js.UndefOr[Double] = js.native
  
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.native
  
  var impostorType: js.UndefOr[Double] = js.native
  
  var restitution: js.UndefOr[Double] = js.native
}
object ImpostorType {
  
  @scala.inline
  def apply(): ImpostorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpostorType]
  }
  
  @scala.inline
  implicit class ImpostorTypeMutableBuilder[Self <: ImpostorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setImpostorSize(value: Double | DepthHeight): Self = StObject.set(x, "impostorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpostorSizeUndefined: Self = StObject.set(x, "impostorSize", js.undefined)
    
    @scala.inline
    def setImpostorType(value: Double): Self = StObject.set(x, "impostorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpostorTypeUndefined: Self = StObject.set(x, "impostorType", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}

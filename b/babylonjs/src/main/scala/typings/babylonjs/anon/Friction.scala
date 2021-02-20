package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Friction extends StObject {
  
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.native
  
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.native
  
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double = js.native
  
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.native
}
object Friction {
  
  @scala.inline
  def apply(impostorType: Double): Friction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
  
  @scala.inline
  implicit class FrictionMutableBuilder[Self <: Friction] (val x: Self) extends AnyVal {
    
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
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}

package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpostorSize extends StObject {
  
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
  var impostorType: js.UndefOr[Double] = js.native
  
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.native
  
  /**
    * If set to true, a mesh impostor will be created when the controller mesh was loaded
    * Note that this requires a physics engine that supports mesh impostors!
    */
  var useControllerMesh: js.UndefOr[Boolean] = js.native
}
object ImpostorSize {
  
  @scala.inline
  def apply(): ImpostorSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpostorSize]
  }
  
  @scala.inline
  implicit class ImpostorSizeMutableBuilder[Self <: ImpostorSize] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUseControllerMesh(value: Boolean): Self = StObject.set(x, "useControllerMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseControllerMeshUndefined: Self = StObject.set(x, "useControllerMesh", js.undefined)
  }
}

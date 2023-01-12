package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateCapsuleOptions extends StObject {
  
  /** Overwrite for the bottom capSubdivisions. */
  var bottomCapSubdivisions: js.UndefOr[Double] = js.undefined
  
  /** Number of sub segments on the cap sections of the capsule running parallel to orientation. */
  var capSubdivisions: js.UndefOr[Double] = js.undefined
  
  /** Height or Length of the capsule. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The Orientation of the capsule.  Default : Vector3.Up() */
  var orientation: js.UndefOr[Vector3] = js.undefined
  
  /** Radius of the capsule. */
  var radius: js.UndefOr[Double] = js.undefined
  
  /** Overwrite for the bottom radius. */
  var radiusBottom: js.UndefOr[Double] = js.undefined
  
  /** Overwrite for the top radius. */
  var radiusTop: js.UndefOr[Double] = js.undefined
  
  /** Number of sub segments on the tube section of the capsule running parallel to orientation. */
  var subdivisions: js.UndefOr[Double] = js.undefined
  
  /** Number of cylindrical segments on the capsule. */
  var tessellation: js.UndefOr[Double] = js.undefined
  
  /** Overwrite for the top capSubdivisions. */
  var topCapSubdivisions: js.UndefOr[Double] = js.undefined
  
  /** Internal geometry is supposed to change once created. */
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object ICreateCapsuleOptions {
  
  inline def apply(): ICreateCapsuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateCapsuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateCapsuleOptions] (val x: Self) extends AnyVal {
    
    inline def setBottomCapSubdivisions(value: Double): Self = StObject.set(x, "bottomCapSubdivisions", value.asInstanceOf[js.Any])
    
    inline def setBottomCapSubdivisionsUndefined: Self = StObject.set(x, "bottomCapSubdivisions", js.undefined)
    
    inline def setCapSubdivisions(value: Double): Self = StObject.set(x, "capSubdivisions", value.asInstanceOf[js.Any])
    
    inline def setCapSubdivisionsUndefined: Self = StObject.set(x, "capSubdivisions", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOrientation(value: Vector3): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusBottom(value: Double): Self = StObject.set(x, "radiusBottom", value.asInstanceOf[js.Any])
    
    inline def setRadiusBottomUndefined: Self = StObject.set(x, "radiusBottom", js.undefined)
    
    inline def setRadiusTop(value: Double): Self = StObject.set(x, "radiusTop", value.asInstanceOf[js.Any])
    
    inline def setRadiusTopUndefined: Self = StObject.set(x, "radiusTop", js.undefined)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    inline def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    inline def setTopCapSubdivisions(value: Double): Self = StObject.set(x, "topCapSubdivisions", value.asInstanceOf[js.Any])
    
    inline def setTopCapSubdivisionsUndefined: Self = StObject.set(x, "topCapSubdivisions", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}

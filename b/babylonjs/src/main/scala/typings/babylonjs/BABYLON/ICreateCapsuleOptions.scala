package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateCapsuleOptions extends js.Object {
  
  /** Overwrite for the bottom capSubdivisions. */
  var bottomCapSubdivisions: js.UndefOr[Double] = js.native
  
  /** Number of sub segments on the cap sections of the capsule running parallel to orientation. */
  var capSubdivisions: Double = js.native
  
  /** Height or Length of the capsule. */
  var height: Double = js.native
  
  /** The Orientation of the capsule.  Default : Vector3.Up() */
  var orientation: js.UndefOr[Vector3] = js.native
  
  /** Radius of the capsule. */
  var radius: Double = js.native
  
  /** Overwrite for the bottom radius. */
  var radiusBottom: js.UndefOr[Double] = js.native
  
  /** Overwrite for the top radius. */
  var radiusTop: js.UndefOr[Double] = js.native
  
  /** Number of sub segments on the tube section of the capsule running parallel to orientation. */
  var subdivisions: Double = js.native
  
  /** Number of cylindrical segments on the capsule. */
  var tessellation: Double = js.native
  
  /** Overwrite for the top capSubdivisions. */
  var topCapSubdivisions: js.UndefOr[Double] = js.native
}
object ICreateCapsuleOptions {
  
  @scala.inline
  def apply(
    capSubdivisions: Double,
    height: Double,
    radius: Double,
    subdivisions: Double,
    tessellation: Double
  ): ICreateCapsuleOptions = {
    val __obj = js.Dynamic.literal(capSubdivisions = capSubdivisions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateCapsuleOptions]
  }
  
  @scala.inline
  implicit class ICreateCapsuleOptionsOps[Self <: ICreateCapsuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapSubdivisions(value: Double): Self = this.set("capSubdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellation(value: Double): Self = this.set("tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomCapSubdivisions(value: Double): Self = this.set("bottomCapSubdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCapSubdivisions: Self = this.set("bottomCapSubdivisions", js.undefined)
    
    @scala.inline
    def setOrientation(value: Vector3): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRadiusBottom(value: Double): Self = this.set("radiusBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusBottom: Self = this.set("radiusBottom", js.undefined)
    
    @scala.inline
    def setRadiusTop(value: Double): Self = this.set("radiusTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusTop: Self = this.set("radiusTop", js.undefined)
    
    @scala.inline
    def setTopCapSubdivisions(value: Double): Self = this.set("topCapSubdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCapSubdivisions: Self = this.set("topCapSubdivisions", js.undefined)
  }
}

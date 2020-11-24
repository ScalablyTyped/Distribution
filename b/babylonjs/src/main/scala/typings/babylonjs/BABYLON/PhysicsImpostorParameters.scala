package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsImpostorParameters extends js.Object {
  
  /**
    * The collision margin around a soft object
    */
  var damping: js.UndefOr[Double] = js.native
  
  /**
    * Specifies if bi-directional transformations should be disabled
    */
  var disableBidirectionalTransformation: js.UndefOr[Boolean] = js.native
  
  /**
    * The number used to fix points on a cloth (0, 1, 2, 4, 8) or rope (0, 1, 2) only
    * 0 None, 1, back left or top, 2, back right or bottom, 4, front left, 8, front right
    * Add to fix multiple points
    */
  var fixedPoints: js.UndefOr[Double] = js.native
  
  /**
    * The friction of the physics imposter
    */
  var friction: js.UndefOr[Double] = js.native
  
  /**
    * Specifies if the parent should be ignored
    */
  var ignoreParent: js.UndefOr[Boolean] = js.native
  
  /**
    * The collision margin around a soft object
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * The mass of the physics imposter
    */
  var mass: Double = js.native
  
  /**
    * The native options of the physics imposter
    */
  var nativeOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * The path for a rope based on an extrusion
    */
  var path: js.UndefOr[js.Any] = js.native
  
  /**
    * The number of iterations used in maintaining consistent vertex positions, soft object only
    */
  var positionIterations: js.UndefOr[Double] = js.native
  
  /**
    * The pressure inside the physics imposter, soft object only
    */
  var pressure: js.UndefOr[Double] = js.native
  
  /**
    * The coefficient of restitution of the physics imposter
    */
  var restitution: js.UndefOr[Double] = js.native
  
  /**
    * The shape of an extrusion used for a rope based on an extrusion
    */
  var shape: js.UndefOr[js.Any] = js.native
  
  /**
    * The stiffness the physics imposter, soft object only
    */
  var stiffness: js.UndefOr[Double] = js.native
  
  /**
    * The number of iterations used in maintaining consistent vertex velocities, soft object only
    */
  var velocityIterations: js.UndefOr[Double] = js.native
}
object PhysicsImpostorParameters {
  
  @scala.inline
  def apply(mass: Double): PhysicsImpostorParameters = {
    val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorParameters]
  }
  
  @scala.inline
  implicit class PhysicsImpostorParametersOps[Self <: PhysicsImpostorParameters] (val x: Self) extends AnyVal {
    
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
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setDisableBidirectionalTransformation(value: Boolean): Self = this.set("disableBidirectionalTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableBidirectionalTransformation: Self = this.set("disableBidirectionalTransformation", js.undefined)
    
    @scala.inline
    def setFixedPoints(value: Double): Self = this.set("fixedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPoints: Self = this.set("fixedPoints", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setIgnoreParent(value: Boolean): Self = this.set("ignoreParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreParent: Self = this.set("ignoreParent", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setNativeOptions(value: js.Any): Self = this.set("nativeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeOptions: Self = this.set("nativeOptions", js.undefined)
    
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPositionIterations(value: Double): Self = this.set("positionIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionIterations: Self = this.set("positionIterations", js.undefined)
    
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressure: Self = this.set("pressure", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
    
    @scala.inline
    def setShape(value: js.Any): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    
    @scala.inline
    def setVelocityIterations(value: Double): Self = this.set("velocityIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityIterations: Self = this.set("velocityIterations", js.undefined)
  }
}

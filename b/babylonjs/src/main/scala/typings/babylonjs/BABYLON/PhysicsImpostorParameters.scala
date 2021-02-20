package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsImpostorParameters extends StObject {
  
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
  implicit class PhysicsImpostorParametersMutableBuilder[Self <: PhysicsImpostorParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setDisableBidirectionalTransformation(value: Boolean): Self = StObject.set(x, "disableBidirectionalTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBidirectionalTransformationUndefined: Self = StObject.set(x, "disableBidirectionalTransformation", js.undefined)
    
    @scala.inline
    def setFixedPoints(value: Double): Self = StObject.set(x, "fixedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPointsUndefined: Self = StObject.set(x, "fixedPoints", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setIgnoreParent(value: Boolean): Self = StObject.set(x, "ignoreParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreParentUndefined: Self = StObject.set(x, "ignoreParent", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeOptions(value: js.Any): Self = StObject.set(x, "nativeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeOptionsUndefined: Self = StObject.set(x, "nativeOptions", js.undefined)
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
    
    @scala.inline
    def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
    
    @scala.inline
    def setShape(value: js.Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
  }
}

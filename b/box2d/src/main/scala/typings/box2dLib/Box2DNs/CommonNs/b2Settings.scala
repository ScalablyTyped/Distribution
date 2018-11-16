package typings
package box2dLib.Box2DNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.b2Settings")
@js.native
class b2Settings () extends js.Object

@JSGlobal("Box2D.Common.b2Settings")
@js.native
object b2Settings extends js.Object {
  /**
  		* Maximum unsigned short value.
  		**/
  var USHRT_MAX: scala.Double = js.native
  /**
  		* The current version of Box2D.
  		**/
  var VERSION: java.lang.String = js.native
  /**
  		* This is used to fatten AABBs in the dynamic tree. This allows proxies to move by a small amount without triggering a tree adjustment. This is in meters.
  		**/
  var b2_aabbExtension: scala.Double = js.native
  /**
  		* This is used to fatten AABBs in the dynamic tree. This is used to predict the future position based on the current displacement. This is a dimensionless multiplier.
  		**/
  var b2_aabbMultiplier: scala.Double = js.native
  /**
  		* A body cannot sleep if its angular velocity is above this tolerance.
  		**/
  var b2_angularSleepTolerance: scala.Double = js.native
  /**
  		* A small angle used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
  		**/
  var b2_angularSlop: scala.Double = js.native
  /**
  		* This scale factor controls how fast overlap is resolved. Ideally this would be 1 so that overlap is removed in one time step. However using values close to 1 often lead to overshoot.
  		**/
  var b2_contactBaumgarte: scala.Double = js.native
  /**
  		* A body cannot sleep if its linear velocity is above this tolerance.
  		**/
  var b2_linearSleepTolerance: scala.Double = js.native
  /**
  		* A small length used as a collision and constraint tolerance. Usually it is chosen to be numerically significant, but visually insignificant.
  		**/
  var b2_linearSlop: scala.Double = js.native
  /**
  		* The maximum angular position correction used when solving constraints. This helps to prevent overshoot.
  		**/
  var b2_maxAngularCorrection: scala.Double = js.native
  /**
  		* The maximum linear position correction used when solving constraints. This helps to prevent overshoot.
  		**/
  var b2_maxLinearCorrection: scala.Double = js.native
  /**
  		* Number of manifold points in a b2Manifold. This should NEVER change.
  		**/
  var b2_maxManifoldPoints: scala.Double = js.native
  /**
  		* The maximum angular velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
  		**/
  var b2_maxRotation: scala.Double = js.native
  /**
  		* b2_maxRotation squared
  		**/
  var b2_maxRotationSquared: scala.Double = js.native
  /**
  		* Maximum number of contacts to be handled to solve a TOI island.
  		**/
  var b2_maxTOIContactsPerIsland: scala.Double = js.native
  /**
  		* Maximum number of joints to be handled to solve a TOI island.
  		**/
  var b2_maxTOIJointsPerIsland: scala.Double = js.native
  /**
  		* The maximum linear velocity of a body. This limit is very large and is used to prevent numerical problems. You shouldn't need to adjust this.
  		**/
  var b2_maxTranslation: scala.Double = js.native
  /**
  		* b2_maxTranslation squared
  		**/
  var b2_maxTranslationSquared: scala.Double = js.native
  /**
  		* 3.141592653589793
  		**/
  var b2_pi: scala.Double = js.native
  /**
  		* The radius of the polygon/edge shape skin. This should not be modified. Making this smaller means polygons will have and insufficient for continuous collision. Making it larger may create artifacts for vertex collision.
  		**/
  var b2_polygonRadius: scala.Double = js.native
  /**
  		* The time that a body must be still before it will go to sleep.
  		**/
  var b2_timeToSleep: scala.Double = js.native
  /**
  		* Continuous collision detection (CCD) works with core, shrunken shapes. This is the amount by which shapes are automatically shrunk to work with CCD. This must be larger than b2_linearSlop.
  		* @see also b2_linearSlop
  		**/
  var b2_toiSlop: scala.Double = js.native
  /**
  		* A velocity threshold for elastic collisions. Any collision with a relative linear velocity below this threshold will be treated as inelastic.
  		**/
  var b2_velocityThreshold: scala.Double = js.native
  /**
  		* b2Assert is used internally to handle assertions. By default, calls are commented out to save performance, so they serve more as documentation than anything else.
  		* @param a Asset an expression is true.
  		**/
  def b2Assert(a: scala.Boolean): scala.Unit = js.native
  /**
  		* Friction mixing law. Feel free to customize this.
  		* Friction values are usually set between 0 and 1. (0 = no friction, 1 = high friction)
  		* By default this is `return Math.sqrt(friction1, friction2);`
  		* @param friction1 Friction 1 to mix.
  		* @param friction2 Friction 2 to mix.
  		* @return The two frictions mixed as one value.
  		**/
  def b2MixFriction(friction1: scala.Double, friction2: scala.Double): scala.Double = js.native
  /**
  		* Restitution mixing law. Feel free to customize this.  Restitution is used to make objects bounce.
  		* Restitution values are usually set between 0 and 1. (0 = no bounce (inelastic), 1 = perfect bounce (perfectly elastic))
  		* By default this is `return Math.Max(restitution1, restitution2);`
  		* @param restitution1 Restitution 1 to mix.
  		* @param restitution2 Restitution 2 to mix.
  		* @return The two restitutions mixed as one value.
  		**/
  def b2MixRestitution(restitution1: scala.Double, restitution2: scala.Double): scala.Double = js.native
}


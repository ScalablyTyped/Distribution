package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "HeadingPitchRoll")
@js.native
open class HeadingPitchRoll () extends StObject {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Unit, pitch: Double) = this()
  def this(heading: Double, pitch: Double, roll: Double) = this()
  def this(heading: Double, pitch: Unit, roll: Double) = this()
  def this(heading: Unit, pitch: Double, roll: Double) = this()
  def this(heading: Unit, pitch: Unit, roll: Double) = this()
  
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  
  /**
    * Compares this HeadingPitchRoll against the provided HeadingPitchRoll componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side HeadingPitchRoll.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: HeadingPitchRoll): Boolean = js.native
  
  /**
    * Compares this HeadingPitchRoll against the provided HeadingPitchRoll componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param [right] - The right hand side HeadingPitchRoll.
    * @param [relativeEpsilon = 0] - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if they are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = js.native
  
  /**
    * Gets or sets the heading.
    */
  var heading: Double = js.native
  
  /**
    * Gets or sets the pitch.
    */
  var pitch: Double = js.native
  
  /**
    * Gets or sets the roll.
    */
  var roll: Double = js.native
}
/* static members */
object HeadingPitchRoll {
  
  @JSImport("@cesium/engine", "HeadingPitchRoll")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplicates a HeadingPitchRoll instance.
    * @param headingPitchRoll - The HeadingPitchRoll to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new HeadingPitchRoll instance if one was not provided. (Returns undefined if headingPitchRoll is undefined)
    */
  inline def clone(headingPitchRoll: HeadingPitchRoll): HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRoll]
  inline def clone(headingPitchRoll: HeadingPitchRoll, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  
  /**
    * Compares the provided HeadingPitchRolls componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first HeadingPitchRoll.
    * @param [right] - The second HeadingPitchRoll.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: HeadingPitchRoll): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: HeadingPitchRoll, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided HeadingPitchRolls componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param [left] - The first HeadingPitchRoll.
    * @param [right] - The second HeadingPitchRoll.
    * @param [relativeEpsilon = 0] - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: HeadingPitchRoll, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns a new HeadingPitchRoll instance from angles given in degrees.
    * @param heading - the heading in degrees
    * @param pitch - the pitch in degrees
    * @param roll - the heading in degrees
    * @param [result] - The object in which to store the result. If not provided, a new instance is created and returned.
    * @returns A new HeadingPitchRoll instance
    */
  inline def fromDegrees(heading: Double, pitch: Double, roll: Double): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(heading.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fromDegrees(heading: Double, pitch: Double, roll: Double, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(heading.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  
  /**
    * Computes the heading, pitch and roll from a quaternion (see http://en.wikipedia.org/wiki/Conversion_between_quaternions_and_Euler_angles )
    * @param quaternion - The quaternion from which to retrieve heading, pitch, and roll, all expressed in radians.
    * @param [result] - The object in which to store the result. If not provided, a new instance is created and returned.
    * @returns The modified result parameter or a new HeadingPitchRoll instance if one was not provided.
    */
  inline def fromQuaternion(quaternion: Quaternion): HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRoll]
  inline def fromQuaternion(quaternion: Quaternion, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
}

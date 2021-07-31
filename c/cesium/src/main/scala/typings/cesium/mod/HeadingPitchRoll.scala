package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HeadingPitchRoll")
@js.native
class HeadingPitchRoll () extends StObject {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Unit, pitch: Double) = this()
  def this(heading: Double, pitch: Double, roll: Double) = this()
  def this(heading: Double, pitch: Unit, roll: Double) = this()
  def this(heading: Unit, pitch: Double, roll: Double) = this()
  def this(heading: Unit, pitch: Unit, roll: Double) = this()
  
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  
  def equals(): Boolean = js.native
  def equals(right: HeadingPitchRoll): Boolean = js.native
  
  def equalsEpsilon(right: Null, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  var heading: Double = js.native
  
  var pitch: Double = js.native
  
  var roll: Double = js.native
}
object HeadingPitchRoll {
  
  @JSImport("cesium", "HeadingPitchRoll")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(headingPitchRoll: HeadingPitchRoll): HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRoll]
  @scala.inline
  def clone_(headingPitchRoll: HeadingPitchRoll, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  
  @scala.inline
  def equalsEpsilon(left: Null, right: Null, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Null, right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Null, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Null, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Null, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Null, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: Null, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Unit, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: Null, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /* static member */
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Null, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: HeadingPitchRoll): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: HeadingPitchRoll, right: HeadingPitchRoll): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromDegrees(heading: Double, pitch: Double, roll: Double): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(heading.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  @scala.inline
  def fromDegrees(heading: Double, pitch: Double, roll: Double, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(heading.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  
  /* static member */
  @scala.inline
  def fromQuaternion(quaternion: Quaternion): HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRoll]
  @scala.inline
  def fromQuaternion(quaternion: Quaternion, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
}
